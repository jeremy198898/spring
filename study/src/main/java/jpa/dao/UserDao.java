package jpa.dao;

import jpa.entity.User;
import jpa.interfaces.IUser;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by jeremy on 2016/8/17.
 */
@Repository
public class UserDao extends AbstractJPADao<User> implements IUser
{
    @PersistenceContext
    private EntityManager em;

    public UserDao() {
        super();
        setClazz(User.class);
    }

    @Override
    public void sayHi() {
        System.out.println("Hello user, you son of bitch!!");
    }

    @Override
    public List<User> findByName(String name) {
        Query rs = em.createQuery("SELECT u FROM User u WHERE u.username=?1");
        List<User> users = rs.setParameter(1,name).getResultList();
        return users;
    }

    @Override
    public String getPassword(String username) {
        List<User> findUser = findByName(username);
        String pass = null;
        if (null != findUser) {
           for (User user : findUser){
                pass = user.getPassword();
           }
            return  pass;
        } else {
            return pass;
        }
    }

    @Override
    public Long count() {
        TypedQuery<Long> query = em.createQuery("SELECT COUNT(u) FROM User u",Long.class);
        long count = query.getSingleResult();
        return count;
    }


}
