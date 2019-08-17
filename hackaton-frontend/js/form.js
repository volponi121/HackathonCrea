function montaTr(empresa) {
    let empresaTr = document.createElement("tr");
    empresaTr.classList.add("paciente");

    empresaTr.appendChild(montaTd(empresa.nome, "info-nome"));
    empresaTr.appendChild(montaTd(empresa.peso, "info-peso"));
    empresaTr.appendChild(montaTd(empresa.altura, "info-altura"));
    empresaTr.appendChild(montaTd(empresa.gordura, "info-gordura"));
    empresaTr.appendChild(montaTd(empresa.imc, "info-imc"));

    return empresaTr;
}

function montaTd(dado, classe) {
    let td = document.createElement("td");
    td.classList.add(classe);
    td.textContent = dado;

    return td;
}

function adicionaPacienteNaTabela(empresa) {
    let empresaTr = montaTr(empresa);
    let tabela = document.querySelector("#tabela-dados");
    tabela.appendChild(empresaTr);
}