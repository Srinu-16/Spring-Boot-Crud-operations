/**
 * 
 */
package com.learning.springbootcurdoperations.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Srinu16
 *
 */
@Entity
@Table(name = "CrudOperationsTable")
public class CrudOperationsModel {
	
	@Id
	private int userId;
	private String firstName;
	private String lastName;
	/**
	 * 
	 */
	public CrudOperationsModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param userId
	 * @param firstName
	 * @param lastName
	 */
	public CrudOperationsModel(int userId, String firstName, String lastName) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "CrudOperationsModel [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
