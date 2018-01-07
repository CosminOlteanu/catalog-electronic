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

console.log("student_id="+student_id)
$.ajax({
  type: "GET",
  url: "/student/" +student_id + "/semestre",
  data: '',
  cache: false,
  success: function(result){
	  var obj = JSON.parse(result)
	  console.log("obj="+obj)
  }
});