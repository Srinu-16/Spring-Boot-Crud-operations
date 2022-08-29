/**
 * 
 */
package com.learning.springbootcurdoperations.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.learning.springbootcurdoperations.model.CrudOperationsModel;

/**
 * @author Srinu16
 *
 */
@Component
public interface CrudOperationsService {

	/**
	 * @return
	 */
	List<CrudOperationsModel> getAllUsersData();

	/**
	 * @param model
	 * @return
	 */
	String saveUser(CrudOperationsModel model);

	/**
	 * @param id
	 * @return
	 */
	String deleteUser(int id);

	/**
	 * @param searchCriteria
	 * @return
	 */
	CrudOperationsModel searchUser(String searchCriteria);

	/**
	 * @param model
	 * @return
	 */
	String updateUser(CrudOperationsModel model);

}
