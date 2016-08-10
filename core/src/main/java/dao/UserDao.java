package dao;

import entity.User;
import interfaces.IUser;
import org.springframework.stereotype.Repository;

/**
 * Created by jeremy on 2016/8/10.
 */
@Repository
public class UserDao extends AbstractJPADao<User> implements IUser
{
    public UserDao()
    {
        super();
        setClazz(User.class);
    }

    @Override
    public void sayHi()
    {
        System.out.println("Hello dao!");
    }
}
