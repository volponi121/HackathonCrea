package br.com.hackathon.hackathon.repository;

import br.com.hackathon.hackathon.entities.SolicitacaoDeFiscalizacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FisRepository extends JpaRepository<SolicitacaoDeFiscalizacao, Long> {
}
