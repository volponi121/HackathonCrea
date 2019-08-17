package br.com.hackathon.hackathon.service;

import br.com.hackathon.hackathon.dto.FisDTO;
import br.com.hackathon.hackathon.entities.SolicitacaoDeFiscalizacao;
import br.com.hackathon.hackathon.repository.FisRepository;
import br.com.hackathon.hackathon.translator.FisTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FisService {

    @Autowired
    private FisRepository fisRepository;

    @Autowired
    private FisTranslator fisTranslator;

    public List<FisDTO> findAll() {
        return fisRepository.findAll()
                .stream()
                .map(fisTranslator::toDto)
                .collect(Collectors.toList());
    }

    public FisDTO findById(Long id) {
        return fisRepository.findById(id)
                .map(fisTranslator::toDto)
                .orElseThrow(() -> new RuntimeException("Solicitação não encontrada"));
    }

    public FisDTO persist(FisDTO dto) {
        SolicitacaoDeFiscalizacao entity = fisRepository.save(fisTranslator.toEntity(dto));
        return fisTranslator.toDto(entity);
    }
}
