package jpa.service;

import jpa.entity.AccessUsers;
import jpa.entity.User;
import jpa.interfaces.IAccessUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jeremy on 2016/9/14.
 */
@Service
//@Transactional
public class AccessUserService {

    @Autowired
    private IAccessUser accessUser;

    public void sayHi(){
        System.out.println(accessUser.sayHi());
    }

    public List<AccessUsers> getAll() {

        return accessUser.getAllUsers();

    }
}
