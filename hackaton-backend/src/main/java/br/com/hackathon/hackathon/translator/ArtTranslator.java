package br.com.hackathon.hackathon.translator;

import org.springframework.stereotype.Component;

import br.com.hackathon.hackathon.dto.ArtDTO;
import br.com.hackathon.hackathon.entities.AnotacaoDeResponsabilidadeTecnica;
import br.com.hackathon.hackathon.entities.ArtId;

@Component
public class ArtTranslator {

	public AnotacaoDeResponsabilidadeTecnica toEntity(ArtDTO dto) {
		ArtId id = ArtId.of(dto.getIdArtNacional(), dto.getNumeroArt(), dto.getProprietario());
		
		AnotacaoDeResponsabilidadeTecnica art = new AnotacaoDeResponsabilidadeTecnica(id, dto.getData(), dto.getModalidade());
		
		return art;
	}
	
	public ArtDTO toDto(AnotacaoDeResponsabilidadeTecnica art) {
		ArtDTO dto = new ArtDTO();
		
		dto.setIdArtNacional(art.getIdArtNacional());
		dto.setNumeroArt(art.getNumeroArt());
		dto.setProprietario(art.getProprietario());
		dto.setData(art.getDataArt());
		dto.setModalidade(art.getModalidade());
		
		return dto;
	}
	
}
