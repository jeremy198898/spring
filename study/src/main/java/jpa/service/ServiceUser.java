package jpa.service;

import jpa.entity.User;
import jpa.interfaces.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jeremy on 2016/8/17.
 */
@Service
@Transactional
public class ServiceUser
{
    @Autowired
    private IUser user;

    public void sayHi()
    {
        user.sayHi();
    }

    public List<User> getAll()
    {
        return user.findAll();
    }

    public void addUser(String username, String password)
    {
        User userNew = new User();
        userNew.setUsername(username);
        userNew.setPassword(password);
        user.create(userNew);
    }

    public boolean isExist(String username)
    {
        List<User> userExist = user.findByName(username);
        Integer num = userExist.size();
        if (num > 0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
