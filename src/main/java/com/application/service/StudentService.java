package com.application.service;

import com.application.dto.AnInfoDto;
import com.application.dto.NotaStudentDto;
import com.application.dto.SemestruDto;
import com.application.dto.StudentInfoDto;
import com.application.entity.*;
import com.application.repository.*;
import javassist.NotFoundException;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SemestruStudentAsociereRepository semestruStudentAsociereRepository;
    @Autowired
    private SemestruRepository semestruRepository;
    @Autowired
    private AnUniversitarRepository anUniversitarRepository;
    @Autowired
    private GrupaRepository grupaRepository;
    @Autowired
    private MaterieRepository materieRepository;
    @Autowired
    private ProfesorRepository profesorRepository;

    public StudentInfoDto getBasingInfo(Long studentId) throws NotFoundException {
        StudentInfoDto studentInfoDto = new StudentInfoDto();

        Student student = studentRepository.findOne(studentId);

        if (student == null) {
            throw new NotFoundException("Nu s-a gasit niciun student cu acest id");
        }

        studentInfoDto.setNume(student.getNume());
        studentInfoDto.setPrenume(student.getPrenume());
        studentInfoDto.setGrupa(student.getGroupaId());

        Grupa grupa = grupaRepository.findOne(student.getGroupaId());
        studentInfoDto.setFacultate(grupa.getFacultate());
        studentInfoDto.setSpecializare(grupa.getSpecializare());

        StudentSemestruAsociere studentSemestruAsociere = semestruStudentAsociereRepository.findByStudentIdAndAndInCursTrue(studentId);
        Semestru semestruInCurs = semestruRepository.findOne(studentSemestruAsociere.getSemestruId());
        studentInfoDto.setSemestru(semestruInCurs.getNumar());

        AnUniversitar anUniversitar = anUniversitarRepository.findOne(semestruInCurs.getAnUniversitarId());
        studentInfoDto.setAn(anUniversitar.getId());

        return studentInfoDto;
    }

    public List<NotaStudentDto> getNote(Long studentId, Long an, Long numarSemestru) throws NotFoundException {
        List<NotaStudentDto> noteStudent = new ArrayList<>();
        Student student = studentRepository.findOne(studentId);

        if (student == null) {
            throw new NotFoundException("Nu s-a gasit niciun student cu acest id");
        }

        Grupa grupa = student.getGrupa();
        Semestru semestru = semestruRepository.findByNumarAndAnUniversitarId(numarSemestru, an);

        List<Materie> materii = materieRepository.findByGroupaIdAndSemestruId(grupa.getId(), semestru.getId());
        materii.forEach(materie -> {
            Nota nota = materie.getNota();
            if (nota != null) {
                Profesor profesor = profesorRepository.findOne(materie.getProfesorId());

                NotaStudentDto notaStudentDto = new NotaStudentDto();
                notaStudentDto.setMaterie(materie.getNume());
                notaStudentDto.setNota(nota.getValoare());
                notaStudentDto.setTipExamen(materie.getTip());
                notaStudentDto.setNumarCredite(materie.getNrCredite());
                notaStudentDto.setData(nota.getData());
                notaStudentDto.setProfesor(profesor.getNume() + " " + profesor.getPrenume());

                noteStudent.add(notaStudentDto);
            }
        });
        return noteStudent;
    }

    public List<AnInfoDto> getSemestreDeStudiu(Long studentId) throws NotFoundException {
        List<AnInfoDto> aniUniversitari = new ArrayList<>();
        Student student = studentRepository.findOne(studentId);
        if (student == null) {
            throw new NotFoundException("Nu s-a gasit niciun student cu acest id");
        }
        StudentSemestruAsociere semestruCurent = semestruStudentAsociereRepository.findByStudentIdAndAndInCursTrue(studentId);

        List<StudentSemestruAsociere> semestreStudent = semestruStudentAsociereRepository.findByStudentId(studentId);
        List<Semestru> semestre = new ArrayList<>();
        semestreStudent.forEach(semestruStudent -> {
            semestre.add(semestruRepository.findOne(semestruStudent.getSemestruId()));
        });

        List<Long> ani = new ArrayList<>();
        semestre.forEach(semestru -> {
            if (!ani.contains(semestru.getAnUniversitarId())) {
                ani.add(semestru.getAnUniversitarId());
            }
        });

        ani.forEach(an -> {
            AnInfoDto anInfoDto = new AnInfoDto();
            anInfoDto.setAn(an);
            List<SemestruDto> semestreDto = new ArrayList<>();
            semestre.forEach(semestru -> {
                if (semestru.getAnUniversitarId().equals(an)) {
                    SemestruDto semestruDto = new SemestruDto();
                    semestruDto.setSemestru(semestru.getNumar());
                    semestruDto.setInCurs(semestru.getId().equals(semestruCurent.getId()));
                    semestreDto.add(semestruDto);
                }
            });
            anInfoDto.setSemestre(semestreDto);
            aniUniversitari.add(anInfoDto);
        });

        return aniUniversitari;
    }
}
