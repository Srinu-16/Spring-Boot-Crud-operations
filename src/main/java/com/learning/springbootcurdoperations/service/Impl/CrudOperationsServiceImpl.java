/**
 * 
 */
package com.learning.springbootcurdoperations.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.springbootcurdoperations.dao.CrudOperationsDao;
import com.learning.springbootcurdoperations.model.CrudOperationsModel;
import com.learning.springbootcurdoperations.service.CrudOperationsService;

/**
 * @author Srinu16
 *
 */
@Service
public class CrudOperationsServiceImpl implements CrudOperationsService{

	@Autowired
	private CrudOperationsDao crudOperationsDao;
	
	@Override
	public List<CrudOperationsModel> getAllUsersData() {
		// TODO Auto-generated method stub
		return crudOperationsDao.getAllUsersData();
	}

	@Override
	public String saveUser(CrudOperationsModel model) {
		// TODO Auto-generated method stub
		return crudOperationsDao.saveUser(model);
	}

	@Override
	public String deleteUser(int id) {
		// TODO Auto-generated method stub
		return crudOperationsDao.deleteUser(id);
	}

	@Override
	public CrudOperationsModel searchUser(String searchCriteria) {
		// TODO Auto-generated method stub
		return crudOperationsDao.searchUser(searchCriteria);
	}

	@Override
	public String updateUser(CrudOperationsModel model) {
		// TODO Auto-generated method stub
		return crudOperationsDao.updateUser(model);
	}

}
