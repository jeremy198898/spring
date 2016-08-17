package jpa.service;

import jpa.interfaces.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jeremy on 2016/8/17.
 */
@Service
public class ServiceUser
{
    @Autowired
    private IUser user;

    public void sayHi()
    {
        user.sayHi();
    }
}
