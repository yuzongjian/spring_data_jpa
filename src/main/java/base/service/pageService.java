/**
 * 
 */
package base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import base.bean.user;

/**
 * @author yuzongjian
 *
 * This is a project for the power supply bureau.
 */
@Service
public class pageService {
	@Autowired
    base.dao.pageDao pageDao;
	
	 public Page<user> findAll(Pageable pageable){
		 return pageDao.findAll(pageable);
	 }
	 public Page<user> findByUserName(String username,Pageable pageable){
		 return pageDao.findByUsername(username, pageable);
	 }
}
