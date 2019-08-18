package br.com.hackathon.hackathon.translator;

import br.com.hackathon.hackathon.dto.FisDTO;
import br.com.hackathon.hackathon.entities.SolicitacaoDeFiscalizacao;
import org.springframework.stereotype.Component;

@Component
public class FisTranslator {

    public SolicitacaoDeFiscalizacao toEntity(FisDTO dto) {
        return new SolicitacaoDeFiscalizacao(dto.getNumeroSolicitacao(), dto.getDataSolicitacao(), dto.getTipoSolicitacao(), dto.getSitucaoAtual(), dto.getProcessosVinculados());
    }

    public FisDTO toDto(SolicitacaoDeFiscalizacao entity) {
        FisDTO fisDTO = new FisDTO();

        fisDTO.setId(entity.getId());
        fisDTO.setDataSolicitacao(entity.getDataSolicitacao());
        fisDTO.setNumeroSolicitacao(entity.getNumeroSolicitacao());
        fisDTO.setProcessosVinculados(entity.getProcessosVinculados());
        fisDTO.setSitucaoAtual(entity.getSituacaoAtual());
        fisDTO.setTipoSolicitacao(entity.getTipoSolicitacao());

        return fisDTO;
    }
}
