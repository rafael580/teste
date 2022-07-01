const url = window.location.href;  
var clienteCriado;

function saveClient(){
	clienteCriado = {
		"name":$("#name").val().trim(),
		"email":$("#email").val().trim(),
		"password":$("#password").val().trim(),
		"dateOFBirth":$("#dob").val().trim(),
		"phoneNumber":$("#phNum").val().trim(),
		"idProofType":$("#proofType").val().trim(),
		"idProofNumer":$("#proofValue").val().trim()
	}

	enviarClient(clienteCriado)
}
function enviarClient(clienteCriado){
const objetoCriado= JSON.stringify(clienteCriado);

	const url_api = `${url}/salvar`;
	$.ajax({
		type: "POST",
		url: url_api,
		data: objetoCriado,
		contentType: "application/json"
	})

}



