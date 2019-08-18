package br.com.hackathon.hackathon.controller;

import br.com.hackathon.hackathon.dto.ArtDTO;
import br.com.hackathon.hackathon.service.ArtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/art")
public class ArtController {
	
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
	
	@PutMapping
	public ArtDTO alterarRegistro(@RequestBody ArtDTO body){
		return artService.persist(body);
	}
	
}
