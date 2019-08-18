function montaTrArt(art) {
    let artTr = document.createElement("tr");
    artTr.classList.add("art");

    artTr.appendChild(montaTd(art.idArtNacional, "info-idArtNacional"));
    artTr.appendChild(montaTd(art.numeroArt, "info-numeroArt"));
    artTr.appendChild(montaTd(art.data, "info-data"));
    artTr.appendChild(montaTd(art.modalidade, "info-modalidade"));
    artTr.appendChild(montaTd(art.proprietario, "info-proprietario"));

    return artTr;
}
function montaFis(art){
    let artFis = document.createElement("fis");
    
    artFis.appendChild(montaFis(art.id, "info-id"));
    artFis.appendChild(montaFis(art.numeroSolicitacao, "info-numeroSolicitacao"));
    artFis.appendChild(montaFis(art.dataSolicitacao, "info-dataSolicitacao"));
    artFis.appendChild(montaFis(art.tipoSolicitacao, "info-tipoSolicitacao"));
    artFis.appendChild(montaFis(art.situacaoAtual, "info-situacaoAtual"));
    artFis.appendChild(montaFis(art.processosVinculados, "info-processosVinculados"));

    return artFis;
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