package service;

import entity.User;
import interfaces.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jeremy on 2016/8/10.
 */
@Service
@Transactional
public class UserService
{
    @Autowired
    private IUser userDao;

    public void sayHi()
    {
        userDao.sayHi();
    }

    public List<User> allUsers()
    {
        return userDao.getAll();
    }

    public void addUser()
    {
        User user = new User();
        user.setUsername("zzd");
        user.setPassword("321654987s");
        userDao.create(user);
    }
}
