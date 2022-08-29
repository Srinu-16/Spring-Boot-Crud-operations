/**
 * 
 */
package com.learning.springbootcurdoperations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springbootcurdoperations.model.CrudOperationsModel;
import com.learning.springbootcurdoperations.service.CrudOperationsService;

/**
 * @author Srinu16
 *
 */
@RestController
@RequestMapping(value = "CrudOperations")
public class CrudOperationsController {

	@Autowired
	private CrudOperationsService crudOperationsService;
	
	@GetMapping(value = "getAllUsers")
	public List<CrudOperationsModel> getAllUsers(){
		List<CrudOperationsModel> listOfAllUsers = crudOperationsService.getAllUsersData();
		return listOfAllUsers;
	}
	
	@PostMapping(value = "SaveUser")
	public String saveUser(@RequestBody CrudOperationsModel model) {
		String messageString = "Failed";
		messageString = crudOperationsService.saveUser(model);
		return messageString;
	}
	
	@DeleteMapping(value = "deleteUser/{id}")
	public String deleteUser(@PathVariable("id") int id) {
		String messageString = "Failed";
		messageString = crudOperationsService.deleteUser(id);
		return messageString;
	}
	
	@PutMapping(value = "updateUser/{id}")
	public String updateUser(@RequestBody CrudOperationsModel model) {
		String messageString = "Failed";
		messageString = crudOperationsService.updateUser(model);
		return messageString;
	}
	
	@GetMapping(value = "searchUser")
	public ResponseEntity<CrudOperationsModel> searchUser(@RequestBody String searchCriteria) {
		if(crudOperationsService.searchUser(searchCriteria)==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}else {
			return ResponseEntity.status(HttpStatus.FOUND).body(crudOperationsService.searchUser(searchCriteria));
		}
	}
	
}
