package com.restapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.restapi.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long>{

}
