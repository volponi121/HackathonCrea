function montaFis(fis){
    let fisTr = document.createElement("tr");
    fisTr.classList.add("fis");
    
    fisTr.appendChild(montaTd(fis.id, "info-id"));
    fisTr.appendChild(montaTd(fis.numeroSolicitacao, "info-numeroSolicitacao"));
    fisTr.appendChild(montaTd(fis.dataSolicitacao, "info-dataSolicitacao"));
    fisTr.appendChild(montaTd(fis.tipoSolicitacao, "info-tipoSolicitacao"));
    fisTr.appendChild(montaTd(fis.situacaoAtual, "info-situacaoAtual"));
    fisTr.appendChild(montaTd(fis.processosVinculados, "info-processosVinculados"));

    return fisTr;
}


function montaTd(dado, classe) {
    var td = document.createElement("td");
    td.classList.add(classe);
    td.textContent = dado;

    return td;
}

function adicionaFisNaTabela(fis) {
    var fisTr = montaFis(fis);
    var tabela = document.querySelector("#tabela-dados");
    tabela.appendChild(fisTr);
}