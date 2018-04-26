package launchcode.com.simplesales.models.data;


import launchcode.com.simplesales.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserDao extends CrudRepository<User, Integer> {
}
