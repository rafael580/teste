const url = window.location.href;  

function loginRequest() {

	var username = $("#userName").val().trim()
	var password = $("#password").val().trim()

	let url_api = `${url}/${username}/${password}`;

	$.ajax({
		type: "GET",
		url: url_api,
	}).done(function(data) {
		if (data) {
			console.log("Deu Certo")
			console.log("Objeto que veio: "+data)
			
			//redirecionando para a pagina do admin
			window.location.href = "Admin";
		} else {
			console.log("Não Deu Certo")
		}
	})
}