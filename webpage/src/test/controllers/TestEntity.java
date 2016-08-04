package controllers;

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
@ContextConfiguration(classes = {BeanConfig.class})
public class TestEntity
{
    @Autowired
    private EntityTestService entityTestService;

    @Test
    public void say()
    {
        System.out.println(entityTestService.sayHi());
    }
}
