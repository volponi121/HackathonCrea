package br.com.hackathon.hackathon.controller;

import br.com.hackathon.hackathon.dto.FisDTO;
import br.com.hackathon.hackathon.service.FisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fis")
public class FisController {

    @Autowired
    private FisService fisService;


    //Get,Post,Put
    @GetMapping("/all")
    public List<FisDTO> getAll(){
        return fisService.findAll();
    }

    @GetMapping("/{id}")
    public FisDTO getById(@RequestParam("id") Long id){
        return fisService.findById(id);
    }

    @PostMapping
    public FisDTO inserirRegistro(@RequestBody FisDTO body){
        return fisService.persist(body);
    }

    @PutMapping
    public FisDTO alterarRegistro(@RequestBody FisDTO body){
        return fisService.persist(body);
    }

}
