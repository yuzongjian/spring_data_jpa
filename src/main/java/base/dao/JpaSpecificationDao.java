/**
 * 
 */
package base.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import base.bean.user;

/**
 * @author yuzongjian
 *
 * This is a project for the power supply bureau.
 */
@Repository 
public interface JpaSpecificationDao extends JpaSpecificationExecutor<user>{
	//继承jpa复杂查询的接口
	

}
