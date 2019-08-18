function montaTr(empresa) {
    let empresaTr = document.createElement("tr");
    empresaTr.classList.add("tr");

    empresaTr.appendChild(montaTd(empresa.idArtNacional, "info-idArt"));
    empresaTr.appendChild(montaTd(empresa.numeroArt, "info-numeroArt"));
    empresaTr.appendChild(montaTd(empresa.data, "info-data"));
    empresaTr.appendChild(montaTd(empresa.modalidade, "info-modalidade"));
    empresaTr.appendChild(montaTd(empresa.proprietario, "info-proprietario"));

    return empresaTr;
}

function montaFis(empresa) {
    let empresaFis = document.createElement("Fis");
    empresaFis.classList.add("fis");

    empresaFis.appendChild(montaFis(empresaFis.id, "info-id"));
    empresaFis.appendChild(montaFis(empresaFis.numeroSolicitacao, "info-numeroSolicitacao"));
    empresaFis.appendChild(montaFis(empresaFis.dataSolicitacao, "info-dataSolicitacao"));
    empresaFis.appendChild(montaFis(empresaFis.tipoSolicitacao, "info-tipoSolicitacao"));
    empresaFis.appendChild(montaFis(empresaFis.situacaoAtual, "info-situacaoAtual"));
    empresaFis.appendChild(montaFis(empresaFis.processosVinculados, "info-processosVinculados"));

    return empresaFis;
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