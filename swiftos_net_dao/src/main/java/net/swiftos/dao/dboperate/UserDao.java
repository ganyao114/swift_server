package net.swiftos.dao.dboperate;

import net.swiftos.dao.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ganyao on 2017/3/22.
 */
@Repository
@Transactional
public interface UserDao extends CrudRepository<User, Long> {

    User findByUserName(String userName);

}
