/**
 * 
 */
package com.great.cms.db.dao;

import java.io.Serializable;
import java.util.List;

import com.great.cms.db.entity.User;

/**
 * @author ziniapc
 *
 */
public interface UserDao extends GenericDao<User, Long> {


	
	
	
	public User findUserByName(String Name);
	
	public User findByEmail(String Email);
	
	
	
	
	

	
}
