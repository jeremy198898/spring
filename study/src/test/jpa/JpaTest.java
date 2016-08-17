package jpa;

import jpa.service.ServiceUser;
import jpa.zconfig.BeanConfig;
import jpa.zconfig.PersistenceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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

}
