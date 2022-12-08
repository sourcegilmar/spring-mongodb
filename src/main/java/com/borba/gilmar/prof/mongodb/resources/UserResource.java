package com.borba.gilmar.prof.mongodb.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.borba.gilmar.prof.mongodb.domain.User;

/*
 * @Controller: diz que essa classe é um recurso REST
 * @RequestMapping: Indica o caminho do endpoint
 */

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	private Integer id;
	
	/*
	 * primeira versao
	@RequestMapping(method=RequestMethod.GET)
	public List<User> findAll() {
		// Vamos fazer um teste
		User maria = new User("1", "Maria Silva", "silva@gmail.com");
		User alex = new User("2", "Alex Silva", "alex@gmail.com");
		List<User> list = new ArrayList<>();
		// Error:
		// The match asList (Object) in the type arrays is not
		// applicable for the arguments (User, User)
		// => list.addAll(Arrays.asList(maria, alex));
		list.add(alex);
		list.add(maria);
		return list;		
		
	}
	*/
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		// Vamos fazer um teste
		User maria = new User("1", "Maria Silva", "silva@gmail.com");
		User alex = new User("2", "Alex Silva", "alex@gmail.com");
		List<User> list = new ArrayList<>();
		// Error:
		// The match asList (Object) in the type arrays is not
		// applicable for the arguments (User, User)
		// => list.addAll(Arrays.asList(maria, alex));
		list.add(alex);
		list.add(maria);
		return ResponseEntity.ok().body(list);		
		
	}

}
