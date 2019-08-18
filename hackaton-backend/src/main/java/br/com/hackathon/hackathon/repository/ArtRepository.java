package br.com.hackathon.hackathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hackathon.hackathon.entities.AnotacaoDeResponsabilidadeTecnica;
import br.com.hackathon.hackathon.entities.ArtId;

public interface ArtRepository extends JpaRepository<AnotacaoDeResponsabilidadeTecnica, ArtId>{
}
