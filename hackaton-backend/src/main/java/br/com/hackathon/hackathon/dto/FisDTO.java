package br.com.hackathon.hackathon.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class FisDTO {

    private Long id;

    private Long numeroSolicitacao;

    private LocalDate dataSolicitacao;

    private String tipoSolicitacao;

    private String situcaoAtual;

    private String processosVinculados;
}
