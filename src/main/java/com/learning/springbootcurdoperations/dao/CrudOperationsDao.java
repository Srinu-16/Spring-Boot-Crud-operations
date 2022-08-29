/**
 * 
 */
package com.learning.springbootcurdoperations.dao;

import java.util.List;

import com.learning.springbootcurdoperations.model.CrudOperationsModel;

/**
 * @author Srinu16
 *
 */
public interface CrudOperationsDao {

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
