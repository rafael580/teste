


function recuperandoObjetoNoCache(){
	const customerLogged = JSON.parse(localStorage.getItem('customer'));
	
	alert("Usuario Logado: "+customerLogged.id + " - " + customerLogged.name +" - etc");
}

recuperandoObjetoNoCache();