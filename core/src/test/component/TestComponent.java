package component;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.EntityTestService;
import service.HiBean;

/**
 * Created by jeremy on 2016/8/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HiBean.class)
public class TestComponent {

    @Autowired
    //private EntityTestService entityTestService;
    private HiBean hiBean;

    @Test
    public void sayHi()
    {
        System.out.println(hiBean.sayHi());
    }
}
