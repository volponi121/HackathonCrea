package br.com.hackathon.hackathon.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ART")
@Getter
@Setter
@NoArgsConstructor
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
