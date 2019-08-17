function montaTr(art) {
    var artTr = document.createElement("tr");
    artTr.classList.add("art");

    artTr.appendChild(montaTd(art.id, "info-id"));
    artTr.appendChild(montaTd(art.numero, "info-numero"));
    artTr.appendChild(montaTd(art.data, "info-data"));
    artTr.appendChild(montaTd(art.proprietario, "info-proprietario"));
    artTr.appendChild(montaTd(art.modalidade, "info-modalidade"));

    return artTr;
}

/* 
function obtemPacienteDoFormulario(form) {

    var paciente = {
        nome: form.nome.value,
        peso: form.peso.value,
        altura: form.altura.value,
        gordura: form.gordura.value,
        imc: calculaImc(form.peso.value, form.altura.value)
    }

    return paciente;
}
 */
function montaTd(dado, classe) {
    var td = document.createElement("td");
    td.classList.add(classe);
    td.textContent = dado;

    return td;
}

function adicionaArtNaTabela(art) {
    var artTr = montaTr(art);
    var tabela = document.querySelector("#tabela-dados");
    tabela.appendChild(artTr);
}