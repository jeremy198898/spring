package service;

import dao.DepartmentDao;
import entity.Department;
import interfaces.IDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jeremy on 2016/8/11.
 */
@Service
@Transactional
public class DepartmentService
{
    @Autowired
    private IDepartment departmentDao;

    public List<Department> getAll()
    {
        return departmentDao.getAll();
    }

    public void add(String name)
    {
        departmentDao.add(name);
    }
}
