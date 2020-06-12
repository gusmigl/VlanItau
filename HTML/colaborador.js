function carregaColaborador(){
    var colabString=localStorage.getItem("colab");
    if(!colabString){
        window.location="index.html";
    }else{
        var colab=JSON.parse(colabString);
        document.getElementById("perfil").innerHTML=
        "<label>Nome:" + colab.nome + "</label><br>" + 
        "<label>Email:" + colab.email + "</label><br>" +
        "<label>Departamento atual:" + colab.departamento.nomedepto + "</label><br>" +
        "<label>" + colab.id + "</label><br>";

        document.getElementById("fotoColaborador").innerHTML=
        "<img src=imagens/" +colab.foto+ " width='10%' class='rounded-circle'>"
    
        fetch("http://localhost:8080/solicitacoes/"+colab.id)
        .then(res => res.json())
        .then(res => popula(res))
        
    }


}


function popula(lista) {
    var strLista = '<div class="row">' +
    '<div class="col-12">' + 

    '<table border="1">' ;
        
        for(i=0; i < lista.length; i++){
            strLista+= '<tr>' +
                '<td>'+lista[i].data+'</td>'+
                '<td>'+lista[i].deptoatual.nomedepto+'</td>'+
                '<td>'+lista[i].deptonovo.nomedepto+'</td>'+
                '<td>'+lista[i].comando+'</td>'+
                '<tr>';
            
        }
        strLista+= '<table>' +
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