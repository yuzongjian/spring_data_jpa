/**
 * 
 */
package base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import base.bean.user;

/**
 * @author yuzongjian
 *
 * This is a project for the power supply bureau.
 */
@Service
public class userService {
	@Autowired
    base.dao.userDao userDao;
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
}
