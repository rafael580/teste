const url = window.location.href;  

function loginRequest() {

	var username = $("#userName").val().trim()
	var password = $("#password").val().trim()

	let url_api = `${url}/AdminLogin/${username}/${password}`;

	$.ajax({
		type: "GET",
		url: url_api,
	}).done(function(data) {
		if (data) {
			console.log("Deu Certo")
		} else {
			console.log("Não Deu Certo")
		}
	})
}