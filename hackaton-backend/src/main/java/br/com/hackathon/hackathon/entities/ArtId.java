package br.com.hackathon.hackathon.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Embeddable
public class ArtId implements Serializable{

	private static final long serialVersionUID = 6876390189404426305L;

	@Column(name = "ID_ART_NACIONAL")
	private Long idArtNacional;

	@Column(name = "NMR_ART")
	private Long numeroArt;
	
	@Column(name = "PROPRIETARIO")
	private String proprietario;
}
