package interfaces;

import entity.User;

import java.util.List;

/**
 * Created by jeremy on 2016/8/10.
 */
public interface IUser
{
    User findOne(long id);

    List<User> getAll();

    void create(User user);

    User update(User user);

    void delete(User user);

    void deleteById(long id);

    void sayHi();
}
