package br.com.hackathon.hackathon.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ArtDTO {

	private Long idArtNacional;
	
	private Long numeroArt;
	
	private LocalDate data;
	
	private String modalidade;
	
	private String proprietario;
}
