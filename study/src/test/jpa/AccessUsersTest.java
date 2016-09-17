package jpa;

import jpa.entity.AccessUsers;
import jpa.service.AccessUserService;
import jpa.zconfig.BeanConfig;
import jpa.zconfig.PersistenceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by jeremy on 2016/8/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BeanConfig.class, PersistenceConfig.class})
public class AccessUsersTest
{
    @Autowired
    private AccessUserService accessUserService;

    @Test
    public void test()
    {
        accessUserService.sayHi();
    }

//    @Test
//    public void add() {
//        String username = "张志德13326";
//        int i = 1;
//        boolean exist = serviceUser.isExist(username);
//        if(!exist) {
//            serviceUser.addUser(username, "31574322zhang");
//            System.out.println("User have been successfully added!");
//        } else {
//            System.out.println("用户已经存在");
//        }
//    }

//    @Test
//    public void add1() {
//        String username = "张志德13329999999";
//        for (int i=2500 ; i<3000; i++) {
//            String usernamer = username+i;
//            serviceUser.addUser(usernamer, "31574322987456zhang"+i);
//            System.out.println("User have been successfully added!"+i);
//        }
//    }

    @Test
    public void x()
    {
        List<AccessUsers> users = accessUserService.getAll();
//        for (AccessUsers user:users)
//        {
//            System.out.println(user.getUsername()+"\t");
//        }
    }

//    @Test
//    public void y()
//    {
//        List<User> users = serviceUser.getPassword
//        System.out.println(users.size());
//    }

//    @Test
//    public void t(){
//        String test = serviceUser.getPassword("张志德13");
//        System.out.println(test);
//    }

//    @Test
//    public void xx(){
//        long x = serviceUser.count();
//        int y = (int)x;
//        //Integer x = new Integer(10);
//        System.out.println(y);
//    }

}
