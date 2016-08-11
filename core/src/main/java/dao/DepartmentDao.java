package dao;

import entity.Department;
import interfaces.IDepartment;
import org.springframework.stereotype.Repository;

/**
 * Created by jeremy on 2016/8/11.
 */
@Repository
public class DepartmentDao extends AbstractJPADao<Department> implements IDepartment
{
    public DepartmentDao()
    {
        super();
        setClazz(Department.class);
    }

    public void add(String name)
    {
        Department department = new Department();
        department.setName(name);
        create(department);
    }
}
