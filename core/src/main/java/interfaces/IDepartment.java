package interfaces;

import entity.Department;

import java.util.List;

/**
 * Created by jeremy on 2016/8/11.
 */
public interface IDepartment
{
    Department findOne(long id);

    List<Department> getAll();

    void create(Department department);

    Department update(Department user);

    void delete(Department department);

    void deleteById(long id);

    void add(String name);
}
