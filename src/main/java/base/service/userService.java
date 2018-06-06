/**
 * 
 */
package base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import base.bean.user;
import base.dao.userDao;

/**
 * @author yuzongjian
 *
 * This is a project for the power supply bureau.
 */
@Service
public class userService {
	@Autowired
    userDao userDao;
	public user findByUsername( String username) {
        return userDao.findByUsername(username);
    }
	 public user findById(int id) {
	        return userDao.findOne(id);
	    }
	 public List<user> findAll() {
	        return userDao.findAll();
	    }
	 public user save(user user) {
	        return userDao.save(user);
	    }
	 public user findByPasswordAndUsernameLike( String password,String username) {
	        return userDao.findByPasswordAndUsernameLike(password,username);
	    }
	 public void delete(int id) {
	        userDao.delete(id);
	    }
	 public long count() {
		 return userDao.count();
	 }
	 public long countByUsername(String username) {
		 return userDao.countByUsername( username);
	 }
	 public int update(String username , int id) {
		 return userDao.update(username, id);
	 }
}
