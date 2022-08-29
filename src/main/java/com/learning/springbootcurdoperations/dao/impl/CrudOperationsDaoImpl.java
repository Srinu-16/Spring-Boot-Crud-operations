/**
 * 
 */
package com.learning.springbootcurdoperations.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learning.springbootcurdoperations.dao.CrudOperationsDao;
import com.learning.springbootcurdoperations.model.CrudOperationsModel;
import com.learning.springbootcurdoperations.repository.CrudOperationsRepository;

/**
 * @author Srinu16
 *
 */
@Component
public class CrudOperationsDaoImpl implements CrudOperationsDao{

	@Autowired
	private CrudOperationsRepository crudOperationsRepository;
	
	@Override
	public List<CrudOperationsModel> getAllUsersData() {
		// TODO Auto-generated method stub
		return crudOperationsRepository.findAll();
	}

	@Override
	public String saveUser(CrudOperationsModel model) {
		// TODO Auto-generated method stub
		crudOperationsRepository.save(model);
		return "Success";
	}

	@Override
	public String deleteUser(int id) {
		// TODO Auto-generated method stub
		crudOperationsRepository.deleteById(id);
		return "Success";
	}

	@Override
	public CrudOperationsModel searchUser(String searchCriteria) {
		// TODO Auto-generated method stub
		CrudOperationsModel searchByFirstName = crudOperationsRepository.searchByFirstName(searchCriteria);
		if (searchByFirstName==null) {
			CrudOperationsModel searchByLastName = crudOperationsRepository.searchByLastName(searchCriteria);
			if(searchByLastName==null) {
				return null;
			}else {
				return searchByLastName;
			}
		}else {
			return searchByFirstName;
		}
	}

	@Override
	public String updateUser(CrudOperationsModel model) {
		// TODO Auto-generated method stub
		crudOperationsRepository.saveAndFlush(model);
		return "Success";
	}
}
