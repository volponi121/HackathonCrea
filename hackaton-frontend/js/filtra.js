var campoFiltro = document.querySelector("#filtrar-tabela");

campoFiltro.addEventListener("input", function() {
    var dados = document.querySelectorAll(".nome");

    if (this.value.length > 0) {
        for (var i = 0; i < dados.length; i++) {
            var empresa = dados[i];
            var tdNome = empresa.querySelector(".info-proprietario");
            var nome = tdNome.textContent;
            var expressao = new RegExp(this.value, "i");

            if (!expressao.test(nome)) {
                empresa.classList.add("invisivel");
            } else {
                empresa.classList.remove("invisivel");
            }
        }
    } else {
        for (var i = 0; i < dados.length; i++) {
            var empresa = dados[i];
            empresa.classList.remove("invisivel");
        }
    }
});
