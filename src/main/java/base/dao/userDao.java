/**
 * 
 */
package base.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import base.bean.user;

/**
 * @author yuzongjian
 *
 * This is a project for the power supply bureau.
 */
@Repository  
@Transactional
public interface userDao extends JpaRepository<user,Integer> {
	 user findByUsername(String username);
	 user findByPasswordAndUsernameLike(String password,String username);
	 long countByUsername(String username);
	
	 
	 /**
	 nativeQuery = true
	 指的是写原生sql代码，如果没有这句，表名要和实体类名完全一致，否则会报错
	  */
	 @Modifying 
     @Query(value ="update admin s set s.password=?1 where s.id=?2",nativeQuery = true)
     int update(String username , int id);
	
}
