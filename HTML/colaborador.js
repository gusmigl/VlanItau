function carregaColaborador(){

    var colabString=localStorage.getItem("colab");

    if(!colabString){

        window.location="index.html";

    }else{

        var colab=JSON.parse(colabString);

        document.getElementById("perfil").innerHTML=

        "<label><b>Funcional: </b>" + colab.id + " - " + "<b>Racf: </b>" +  colab.racf + "</label><br>" +

        "<label><b>Nome: </b>" + " " + colab.nome + "</label><br>" + 

        "<label><b>Email: </b>" + " " + colab.email + "</label><br>" +

        "<label><b>Departamento atual: </b>" + " " + colab.departamento.nomedepto + "</label><br>" +

        "<label><b>Maquina</b></label><br>" +

        "<label><b>Numero Serie: </b>" + " " + colab.numseri + "</label><br>" +

        "<label><b>Descrição: </b>" + " " + colab.descricao + "</label><br>" +

        "<label><b>Numero Conector de Rede: </b>" + " " + colab.numconector + "</label><br>"

 

        ;

 

        document.getElementById("fotoColaborador").innerHTML=

        "<img src=imagens/" +colab.foto+ " width='50%' class='rounded-circle'>"

    

        fetch("http://localhost:8080/solicitacoes/"+colab.id)

        .then(res => res.json())

        .then(res => popula(res))

        

    }

 

 

}

 

 

function popula(lista) {

    var strLista = '<div class="row">' +

    '<div class="col-12">' + 

 

    '<table class="table table-striped">' +

    ' <thead>' +

    '<tr>' +

      '<th>Data</th>' +

      '<th>Depto Atual</th>' +

      '<th>Depto Novo</th>' +

      '<th>Justificativa</th>' +

      '<th>Comando</th>' +

    '</tr>' +

  '</thead>' + 

  '<tbody>' ;  

        

        for(i=0; i < lista.length; i++){

            

            strLista+= '<tr>' +

                '<td>'+lista[i].data+'</td>'+

                '<td>'+lista[i].deptoatual.nomedepto+'</td>'+

                '<td>'+lista[i].deptonovo.nomedepto+'</td>'+

                '<td>'+lista[i].justificativa+'</td>'+

                '<td>'+lista[i].comando+'</td>'+

                '<tr>';

            

        }

        strLista+= '</tbody></table>' +

        '</div>' +

    '</div>'

    

 

document.getElementById("solicitacoes").innerHTML= strLista

 

 

 

 

}

 

 

function logout(){

 

    localStorage.removeItem("colab");

    window.location="index.html";

 

}

 

 

function criarSolicitacao(){

    window.location="solicitacao.html";

}