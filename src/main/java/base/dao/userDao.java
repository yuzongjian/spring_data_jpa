/**
 * 
 */
package base.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import base.bean.user;

/**
 * @author yuzongjian
 *
 * This is a project for the power supply bureau.
 */
@Repository  
public interface userDao extends JpaRepository<user,Integer> {
	 user findByUsername(String username);
}
