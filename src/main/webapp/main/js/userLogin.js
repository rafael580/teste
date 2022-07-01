const url = window.location.href;  

function loginRequest() {

	var username = $("#userName").val().trim()
	var password = $("#password").val().trim()

	let url_api = `${url}/${username}/${password}`;
	console.log("Entrou nesta funcao");

	$.ajax({
		type: "GET",
		url: url_api,
	}).done(function(user) {
		if (user) {
			
			var objeto = JSON.stringify(user);
			console.log("Deu Certo, Objeto que veio: "+objeto)
			
			// Salvar objeto no cache para tu recuperar na proxima pagina
			localStorage.setItem('customer', objeto);
			
			//redirecionando para a pagina do DeluxeAC
			window.location.href = "DeluxeAC";
		} else {
			console.log("Não Deu Certo")
		}
	})
}