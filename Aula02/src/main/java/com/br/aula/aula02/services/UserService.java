package com.br.aula.aula02.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.aula.aula02.entities.User;
import com.br.aula.aula02.repositories.UserRepositories;

@Service
public class UserService {

    @Autowired
    private UserRepositories repository;

    public List<User> findAll() {
        return repository.findAll();
    }
    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
                return obj.get();
    }
    public User insert(User obj) {
    	return repository.save(obj);
    }
    public void delete(Long id) {
    	repository.deleteById(id);
    }
    public User update(Long id, User obj) {
    	User entity = repository.getReferenceById(id);
    	updateData(entity,obj);
    	return repository.save(entity);
    
    }
	private void updateData(User entity, User obj) {
		entity.setNome(obj.getNome());
		entity.setEmail(obj.getEmail());
		entity.setPassword(obj.getPassword());
		
	}

}
