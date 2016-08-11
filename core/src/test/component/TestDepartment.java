package component;

import entity.Department;
import entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.DepartmentService;
import zconfig.DaoConfig;
import zconfig.PersistenceConfig;
import zconfig.ServiceConfig;

import java.util.List;

/**
 * Created by jeremy on 2016/8/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ServiceConfig.class, PersistenceConfig.class, DaoConfig.class})
public class TestDepartment
{
    @Autowired
    private DepartmentService test;

    @Test
    public void add()
    {
        test.add("市场部门");
        System.out.println("Successfully added!");
    }

    @Test
    public void show()
    {
        List<Department> departments = test.getAll();
        String s = "";
        for (Department department: departments)
        {
            s += department.getName()+" ";
        }
        System.out.println(s);
    }


}
