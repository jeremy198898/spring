package component;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.ServiceTest;
import zconfig.BeanConfig;
import zconfig.DataConfig;
import zconfig.PersistenceConfig;

/**
 * Created by jeremy on 2016/8/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BeanConfig.class, DataConfig.class})
public class TestUser
{
    @Autowired
    private ServiceTest test;

    @Test
    public void say()
    {
        test.doit();
    }
}
