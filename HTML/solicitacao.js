function carregaDepartamento(){
        fetch("http://localhost:8080/departamentos")
        .then(res => res.json())
        .then(res => populaCombo(res))
}



function populaCombo(lista) {

    var colabString=localStorage.getItem("colab");
    var colab=JSON.parse(colabString);


    var strLista = '<div class="row">' +
    '<div class="col-12">' + 


  
    '<label for="exampleFormControlSelect1">Departamento</label>' +
    '<select class="form-control" id="departamento">' 
    for(i=0; i < lista.length; i++){
        if(lista[i].codigo != colab.departamento.codigo ){
            strLista+= "<option value='" + lista[i].codigo + "'>" + lista[i].nomedepto + ' - ' +  lista[i].endbase  + '</option>';
        }
    }
    strLista+= '</select>' +
  '</div>' +
  '</div>'
document.getElementById("combodepto").innerHTML= strLista

}

function salvarSolicitacao(){

    if (document.getElementById("justificativa").value == '') {

        alert("Informe a justificativa!");
        return;

    } else {

        var colabString=localStorage.getItem("colab");
        var colab=JSON.parse(colabString);

        var data = new Date();
        var dia = data.getDate();
        var mes = data.getMonth() + 1;
        var ano = data.getFullYear();

        var hoje = dia + '/' + mes + '/' + ano;
            var mensagem={
            data:hoje,
            colaborador:{
                id:colab.id
            }, 
            "deptoatual":{
                "codigo":colab.departamento.codigo
                            }, 
            "deptonovo":{
                "codigo":document.getElementById("departamento").value
                        }, 
            "comando":"", 
            "justificativa":document.getElementById("justificativa").value
        };

        var cabecalho={
            method:"POST",
            body:JSON.stringify(mensagem),
            headers:{
                'Content-Type':'application/json'
            }
        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
        fetch("http://localhost:8080/solicitacao/nova", cabecalho)
        .then(res => res.json())
        .then(res => {alert("Solicitação realizada! Aguarde o processamento.");
            window.location="colaborador.html"
        })
        .catch(err => {
            alert("Probblemas na gravação da sua solicitação, tente novamente dentro de alguns minutos! :( ");
        })
    }

    

}








