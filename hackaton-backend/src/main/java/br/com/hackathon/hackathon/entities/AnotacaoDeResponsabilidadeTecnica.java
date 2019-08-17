package br.com.hackathon.hackathon.entities;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "ART")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class AnotacaoDeResponsabilidadeTecnica implements Serializable{

	private static final long serialVersionUID = -293612279390974965L;

	@EmbeddedId
	private ArtId id;

	@Column(name = "DATE")
	private LocalDate dataArt;

	@Column(name = "MODALIDADE")
	private String modalidade;

	
	public Long getIdArtNacional() {
		return this.id.getIdArtNacional();
	}
	
	public Long getNumeroArt() {
		return this.id.getNumeroArt();
	}
	
	public String getProprietario() {
		return this.id.getProprietario();
	}
}
