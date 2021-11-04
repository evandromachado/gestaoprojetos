package com.qintess.academia.microservissos.gestaomunicipal.gestaoprojetos.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qintess.academia.microservissos.gestaomunicipal.gestaoprojetos.entity.Project;
import com.qintess.academia.microservissos.gestaomunicipal.gestaoprojetos.service.GestaoProjetosService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/projects")
@Api(value = "Projetos", tags = {"Projetos"})
public class GestaoProjetosController {
	
	private GestaoProjetosService gestaoProjetosService;

	public GestaoProjetosController(GestaoProjetosService service) {
		this.gestaoProjetosService = service;
	}

    @PostMapping
    public Project addProject(@RequestBody Project project) {
        return gestaoProjetosService.addProject(project);
    }

    @GetMapping(path = "/{id}")
    public Optional<Project> getProject(@PathVariable Long id) {
        return gestaoProjetosService.getProject(id);
    }

    @DeleteMapping(path = "/{id}")
    public String removeProject(@PathVariable Long id) {
        return gestaoProjetosService.removeProject(id);
    }

    
}
