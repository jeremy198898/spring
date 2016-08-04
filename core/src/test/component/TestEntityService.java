package component;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.EntityTestService;
import zconfig.BeanConfig;

/**
 * Created by jeremy on 2016/8/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BeanConfig.class)
public class TestEntityService
{
    @Autowired
    private EntityTestService testService;

    @Test
    public void say()
    {
        System.out.println(testService.sayHi());
    }
}
