var botaoAdicionar = document.querySelector("#buscar-dados");

botaoAdicionar.addEventListener("click", function() {
    var xhr = new XMLHttpRequest();

    xhr.open("GET", "http://localhost:8080/fis/all");

    

    xhr.addEventListener("load", function() {
        var erroAjax = document.querySelector("#erro-ajax");

        if (xhr.status == 200) {
            erroAjax.classList.add("invisivel");
            var resposta = xhr.responseText;
            var dados = JSON.parse(resposta);

            console.log(resposta);

            dados.forEach(function(fis) {
                adicionaFisNaTabela(fis);
            });
        } else {
            erroAjax.classList.remove("invisivel");
        }
    });

    xhr.send();
});