package jpa;

import jpa.entity.User;
import jpa.service.ServiceUser;
import jpa.zconfig.BeanConfig;
import jpa.zconfig.PersistenceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * Created by jeremy on 2016/8/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BeanConfig.class, PersistenceConfig.class})
public class JpaTest
{
    @Autowired
    private ServiceUser serviceUser;

    @Test
    public void test()
    {
        serviceUser.sayHi();
    }

    @Test
    public void add()
    {
        serviceUser.addUser("wangbaoqiang", "123465");
    }

    @Test
    public void x()
    {
        List<User> users = serviceUser.getAll();
        for (User user:users)
        {
            System.out.println(user.getUsername());
        }
    }

    @Test
    public void y()
    {
        List<User> users = serviceUser.findByName("zhangzhide");
        for (User user:users)
        {
            System.out.println(user.getId());
        }
    }

}
