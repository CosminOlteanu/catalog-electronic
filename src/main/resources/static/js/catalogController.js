function getCookie(cname) {
    var name = cname + "=";
    var decodedCookie = decodeURIComponent(document.cookie);
    var ca = decodedCookie.split(';');
    for(var i = 0; i <ca.length; i++) {
        var c = ca[i];
        while (c.charAt(0) == ' ') {
            c = c.substring(1);
        }
        if (c.indexOf(name) == 0) {
            return c.substring(name.length, c.length);
        }
    }
    return "";
}
var student_id=getCookie("student_id")

$.ajax({
  type: "GET",
  url: "/student/" +student_id + "/semestre",
  data: '',
  cache: false,
  success: function(result){
	  for(var i=0; i<result.length; i++){
		  $('#an').append($('<option>', {
			    value: result[i].an,
			    text: result[i].an
			}));
		 
	  }
  }
});

$.ajax({
    type: "GET",
    url: "/student/" +student_id + "/info",
    data: '',
    cache: false,
    success: function(result){
        document.getElementById("nume").innerHTML = " <span>" +  result.nume + " " + result.prenume + "</span>";
        document.getElementById("grupa").innerHTML = " <span>" +  result.grupa + "</span>";
        document.getElementById("facultate").innerHTML = " <span>" +  result.facultate + "</span>";
        document.getElementById("specializare").innerHTML = " <span>" +  result.specializare + "</span>";
        result;
    }
});

function getTable(){
document.getElementById("tbody").innerHTML = " <span></span>";
	$.ajax({
		  type: "GET",
		  url: "/student/" +student_id + "?an="+
			$( "#an" ).val()+"&semestru="+
			$( "#semestru" ).val(),
		  data: '',
		  cache: false,
		  success: function(result){
			  for(var i=0; i<result.length; i++){
				  $('#table span:first').after('<tr><td>'+ result[i].profesor+'</td>'+
				  '<td>'+ result[i].materie+'</td>'+
				  '<td>'+ result[i].tipExamen+'</td>'+
				  '<td>'+ result[i].numarCredite+'</td>'+
				  '<td>'+ result[i].nota+'</td>'+
				  '<td>'+ result[i].data+'</td><td>');
			  }
		  }
		});
}
setTimeout(function(){ getTable(); }, 500);
