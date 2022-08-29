/**
 * 
 */
package com.learning.springbootcurdoperations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.learning.springbootcurdoperations.model.CrudOperationsModel;

/**
 * @author Srinu16
 *
 */
@Repository
public interface CrudOperationsRepository extends JpaRepository<CrudOperationsModel, Integer>{

	/**
	 * @param searchCriteria
	 * @return
	 */
	@Query(value = "select * from CrudOperationsTable where firstname=:searchCriteria",nativeQuery = true)
	CrudOperationsModel searchByFirstName(@Param("searchCriteria")String searchCriteria);

	/**
	 * @param searchCriteria
	 * @return
	 */
	@Query(value = "select * from CrudOperationsTable where firstname=:searchCriteria",nativeQuery = true)
	CrudOperationsModel searchByLastName(@Param("searchCriteria")String searchCriteria);

}
