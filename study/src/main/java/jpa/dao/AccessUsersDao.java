package jpa.dao;

import jpa.entity.AccessUsers;
import jpa.interfaces.IAccessUser;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

/**
 * Created by jeremy on 2016/9/14.
 */
@Repository
public class AccessUsersDao extends AbstractJPADao<jpa.entity.AccessUsers> implements IAccessUser{

    @PersistenceUnit(name = "")
    @PersistenceContext
    private EntityManager em;

    public AccessUsersDao() {
        super();
        setClazz(AccessUsers.class);
    }

    @Override
    public String sayHi() {
        return "I love you";
    }

    public List<AccessUsers> getAllUsers() {
        long l = System.currentTimeMillis();
        System.out.println(l +"------------->>");

        Query rs = em.createQuery("select u from AccessUsers u");
        rs.setHint("org.hibernate.cacheable", true);

        List<AccessUsers> users = rs.getResultList();

        long l2 = System.currentTimeMillis();
        System.out.println(l2 +"------------->>end--->"+(l2-l)+"毫秒");

        return users;
    }

}
