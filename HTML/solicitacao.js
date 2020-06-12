function carregaDepartamento(){
        fetch("http://localhost:8080/departamentos")
        .then(res => res.json())
        .then(res => populaCombo(res))
    }


}


function populaCombo(lista) {
    var strLista = '<div class="row">' +
    '<div class="col-12">' + 


  
    '<label for="exampleFormControlSelect1">Departamento</label>' +
    '<select class="form-control" id="exampleFormControlSelect1">' +
    for(i=0; i < lista.length; i++){
        strLista+= '<option>' + lista[i].nomedepto + '</option>';
    }
    strLista+= '</select>' +
  '</div>' +
  '</div>'
document.getElementById("combodepto").innerHTML= strLista




}


function logout(){

    localStorage.removeItem("colab");
    window.location="index.html";

}