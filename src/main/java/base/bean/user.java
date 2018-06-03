/**
 * 
 */
package base.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author yuzongjian
 *
 * This is a project for the power supply bureau.
 */
@Entity  
@Table(name="admin")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer  id;
   
    private String username;

    private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
