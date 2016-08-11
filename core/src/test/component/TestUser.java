package component;

import entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.UserService;
import zconfig.DaoConfig;
import zconfig.PersistenceConfig;
import zconfig.ServiceConfig;

import java.util.List;

/**
 * Created by jeremy on 2016/8/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ServiceConfig.class, PersistenceConfig.class, DaoConfig.class})
public class TestUser
{
    @Autowired
    private UserService test;

    @Test
    public void say()
    {
        test.sayHi();
    }

    @Test
    public void show()
    {
        List<User> users = test.showUser();
        String s = "";
        for (User user: users)
        {
            s += user.getUsername()+" ";
        }
        System.out.println(s);
    }

//    @Test
//    public void add()
//    {
//        test.addUser();
//        System.out.println("Successfully added!");
//    }
}
