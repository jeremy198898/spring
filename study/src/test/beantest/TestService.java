package beantest;

import bean.inf.IService;
import bean.zconfig.BeanConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jeremy on 2016/8/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BeanConfig.class})
public class TestService
{
//    @Autowired
//    private IService test;
//
//    @Test
//    public void say()
//    {
//        test.sayHi();
//    }
}
