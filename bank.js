
function clearErrMsg1() {
		document.getElementById("fname_err").innerHTML='';
}

function clearErrMsg2() {
		document.getElementById("lname_err").innerHTML='';
}


function clearErrMsg3() {
		document.getElementById("dob_err").innerHTML='';
}


function clearErrMsg4() {
		document.getElementById("email_err").innerHTML='';
}


function getData() {
	alert('java script is executed');

	var fname = document.getElementById("my_fname").value;
	var lname = document.getElementById("my_lname").value;
	var doj   = document.getElementById("my_dob").value;
	var email = document.getElementById("my_email").value;
	
	if(fname=="") {
		document.getElementById("fname_err").innerHTML='First Name cannot be empty';
		return false;
	}
	
	if(lname=="") {
		document.getElementById("lname_err").innerHTML='Last Name cannot be empty';
		return false;
	}
	
	if(doj=="") {
		document.getElementById("dob_err").innerHTML='Birthdate cannot be empty';
		return false;
	}
	
	if(email=="") {
				document.getElementById("email_err").innerHTML='Email cannot be empty';
		return false;
	}
	
	console.log('fname ',fname);
	console.log('lname ',lname);
	console.log('doj   ',doj);
	console.log('email ',email);
	
	/*
	alert(fname);
	alert(lname);
	alert(doj);
	alert(email);
   */
	return true;
}
