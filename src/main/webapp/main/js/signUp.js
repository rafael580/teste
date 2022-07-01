const url = window.location.href;
var clienteCriado;



$(function() {
	$("#customerForm").submit(function(event) {
		event.preventDefault();

		clienteCriado = {
			"name": $("#name").val().trim(),
			"email": $("#email").val().trim(),
			"password": $("#password").val().trim(),
			"dateOFBirth": $("#dob").val().trim(),
			"phoneNumber": $("#phNum").val().trim(),
			//			"idProofType": $("#proofType").val().trim(),
			"idProofType": 0,
			"idProofNumer": $("#proofValue").val().trim()
		}

		const url_api = `${url}/salvar`;

		$.ajax({
			type: "POST",
			url: url_api,
			data: JSON.stringify(clienteCriado),
			contentType: "application/json",

		}).done(function(result) {

			if (result) {
				console.log("Deu certo Receeeeba");
			} else {
				console.log("Deu errado, objeto veio nulo");
			}
		});
		return false
	});
});


// Se usar o metodo abaixo o form não fara as vericacoes de campos
function enviar(event) {
	event.preventDefault();

	clienteCriado = {
		"name": $("#name").val().trim(),
		"email": $("#email").val().trim(),
		"password": $("#password").val().trim(),
		"dateOFBirth": $("#dob").val().trim(),
		"phoneNumber": $("#phNum").val().trim(),
		"idProofType": $("#proofType").val().trim(),
		"idProofNumer": $("#proofValue").val().trim()
	}

	const url_api = `${url}/salvar`;

	$.ajax({
		type: "POST",
		url: url_api,
		data: JSON.stringify(clienteCriado),
		contentType: "application/json",
		success: function(result) {
			console.log('Data received: ');
			console.log(result);
		}
	})
}




