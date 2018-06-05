/**
 * 
 */
package base.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import base.bean.user;

/**
 * @author yuzongjian
 *
 * This is a project for the power supply bureau.
 */
@Repository  
public interface pageDao extends PagingAndSortingRepository<user, Integer> {
	 Page<user> findAll(Pageable pageable);
}
