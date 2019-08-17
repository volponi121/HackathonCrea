package br.com.hackathon.hackathon.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hackathon.hackathon.dto.ArtDTO;
import br.com.hackathon.hackathon.entities.AnotacaoDeResponsabilidadeTecnica;
import br.com.hackathon.hackathon.entities.ArtId;
import br.com.hackathon.hackathon.repository.ArtRepository;
import br.com.hackathon.hackathon.translator.ArtTranslator;


@Service
public class ArtService {
	@Autowired
	private ArtRepository artRepository;
	
	@Autowired
	private ArtTranslator artTranslator;
	
	public List<ArtDTO> findAll() { 
		return artRepository.findAll()
				.stream()
				.map(artTranslator::toDto)
				.collect(Collectors.toList());
	}
	
	public ArtDTO findById(Long artIdNacional, Long numeroArt, String proprietario) {
		ArtId id = ArtId.of(artIdNacional, numeroArt, proprietario);
		return artRepository.findById(id)
				.map(artTranslator::toDto)
				.orElseThrow(() -> new RuntimeException("ART não encontrada."));
	}
	
	public ArtDTO persist(ArtDTO dto) {
		AnotacaoDeResponsabilidadeTecnica entidade = artRepository.save(artTranslator.toEntity(dto));
		
		return artTranslator.toDto(entidade);
	}
	
}
