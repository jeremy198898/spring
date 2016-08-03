package controllers;

import beans.BeanTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jeremy on 2016/8/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BeanTest.class)
public class TestComponent {

    @Autowired
    private BeanTest beanTest;

    @Test
    public void sayHi()
    {
        System.out.println(beanTest.sayHi());
    }
}
