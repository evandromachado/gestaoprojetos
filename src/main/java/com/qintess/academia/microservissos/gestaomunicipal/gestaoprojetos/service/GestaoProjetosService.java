package com.qintess.academia.microservissos.gestaomunicipal.gestaoprojetos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qintess.academia.microservissos.gestaomunicipal.gestaoprojetos.entity.Project;
import com.qintess.academia.microservissos.gestaomunicipal.gestaoprojetos.repository.GestaoProjetosRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GestaoProjetosService {
	
	private GestaoProjetosRepository gestaoProjetosRepository;
	
	public Project addProject(Project project) {
		return gestaoProjetosRepository.save(project);
	}

	public Optional<Project> getProject(Long id) {
		return gestaoProjetosRepository.findById(id);
	}

	public String removeProject(Long id) {
		gestaoProjetosRepository.deleteById(id);
		return "Removido com sucesso";
	}

}
