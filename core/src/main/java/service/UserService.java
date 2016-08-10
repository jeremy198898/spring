package service;

import interfaces.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jeremy on 2016/8/10.
 */
@Service
public class UserService
{
    @Autowired
    private IUser user;


}
