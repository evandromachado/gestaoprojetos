package com.qintess.academia.microservissos.gestaomunicipal.gestaoprojetos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.academia.microservissos.gestaomunicipal.gestaoprojetos.entity.Project;

public interface GestaoProjetosRepository extends JpaRepository<Project, Long>  {

}
