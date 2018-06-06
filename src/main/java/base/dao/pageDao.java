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
 * IsNotNull	findByAgeNotNull	...  where x.age not null
Like	findByNameLike	...  where x.name like ?1
NotLike	findByNameNotLike	...  where x.name not like ?1
StartingWith	findByNameStartingWith	...  where x.name like ?1(parameter bound with appended %)
EndingWith	findByNameEndingWith	...  where x.name like ?1(parameter bound with prepended %)
Containing	findByNameContaining	...  where x.name like ?1(parameter bound wrapped in %)
OrderBy	findByAgeOrderByName	...  where x.age = ?1 order by x.name desc
Not	findByNameNot	...  where x.name <> ?1
In	findByAgeIn	...  where x.age in ?1
NotIn	findByAgeNotIn	...  where x.age not in ?1
True	findByActiveTrue	...  where x.avtive = true
Flase	findByActiveFalse	...  where x.active = false
And 	findByNameAndAge	...  where x.name = ?1 and x.age = ?2
Or	findByNameOrAge	...  where x.name = ?1 or x.age = ?2
Between	findBtAgeBetween	...  where x.age between ?1 and ?2
LessThan	findByAgeLessThan	...  where x.age  <  ?1
GreaterThan	findByAgeGreaterThan	...  where x.age > ?1
After/Before	...	...
IsNull	findByAgeIsNull	...  where x.age is null
 */
@Repository  
public interface pageDao extends PagingAndSortingRepository<user, Integer> {
	 Page<user> findAll(Pageable pageable);
	 Page<user> findByUsername(String username,Pageable pageable);
}
