package com.borba.gilmar.prof.mongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.borba.gilmar.prof.mongodb.domain.User;
import com.borba.gilmar.prof.mongodb.repository.UserRepository;

@Service
public class UserService {
	
	// Como pode ser visto na arquitetura do projeto a camada
	// de serviço tem de conversar com o repositório, vamos instanciar
	// um objeto, usaremos a notação @Autowired. Isso é o mecanismo
	// de injeção de dependência automática do Spring.
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
}
