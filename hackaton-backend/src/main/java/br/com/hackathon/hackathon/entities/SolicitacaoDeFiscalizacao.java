package br.com.hackathon.hackathon.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "FIS")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SolicitacaoDeFiscalizacao {

	@Id
	@Column(name = "ID_FIS")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Setter
	@Column(name = "NMR_FIS")
	private Long numeroSolicitacao;

	@Setter
	@Column(name = "DATA_SOLICITACAO")
	private LocalDate dataSolicitacao;

	@Setter
	@Column(name = "TIPO_SOLICITACAO")
	private String tipoSolicitacao;

	@Setter
	@Column(name = "SITUACAO_ATUAL")
	private String situacaoAtual;

	@Setter
	@Column(name = "PROCESSOS_VINCULADOS")
	private String processosVinculados;

	public SolicitacaoDeFiscalizacao(Long id, Long numeroSolicitacao, LocalDate dataSolicitacao, String tipoSolicitacao,
			String situacaoAtual, String processosVinculados) {
		this.id = id;
		this.numeroSolicitacao = numeroSolicitacao;
		this.dataSolicitacao = dataSolicitacao;
		this.tipoSolicitacao = tipoSolicitacao;
		this.situacaoAtual = situacaoAtual;
		this.processosVinculados = processosVinculados;
	}
}
