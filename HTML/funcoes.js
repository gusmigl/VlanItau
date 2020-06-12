function login(){

    
    if (document.getElementById("txtEmail").value == '' || document.getElementById("txtSenha").value == '' ) {

            alert("Preencha os campos!");

    } else {
        var login  = document.getElementById("txtEmail").value;
  
        if(login.indexOf("@") != -1){
            var mensagem={
                email:document.getElementById("txtEmail").value,
                senha:document.getElementById("txtSenha").value
            };
        } else {
            var mensagem={
                racf:document.getElementById("txtEmail").value,
                senha:document.getElementById("txtSenha").value
            };
        }

        var cabecalho={
            method:"POST",
            body:JSON.stringify(mensagem),
            headers:{
                'Content-Type':'application/json'
            }
        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
        fetch("http://localhost:8080/login", cabecalho)
        .then(res => res.json())
        .then(res => {
            localStorage.setItem("colab", JSON.stringify(res));
            window.location="colaborador.html"
        })
        .catch(err => {
            alert("Login Invalido");
        })
 
    }

   
}

