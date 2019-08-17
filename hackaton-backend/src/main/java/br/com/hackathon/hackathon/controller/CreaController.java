package br.com.hackathon.hackathon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hackathon.hackathon.dto.ArtDTO;
import br.com.hackathon.hackathon.service.ArtService;


@RestController
@RequestMapping("/home")
public class CreaController {
	
	@Autowired
	private ArtService artService;
	
	//Get,Post,Put
	@GetMapping("/all")
	public List<ArtDTO> getAll(){
		return artService.findAll();
	}
	
	@GetMapping
	public ArtDTO getById(@RequestBody ArtDTO body){
		return artService.findById(body.getIdArtNacional(), body.getNumeroArt(), body.getProprietario());
	}
	
	@PostMapping
	public ArtDTO inserirRegistro(@RequestBody ArtDTO body){
		return artService.persist(body);
	}
	
	@PutMapping("/{id}")
	public ArtDTO alterarRegistro(@RequestBody ArtDTO body){
		return artService.persist(body);
	}
	
}
