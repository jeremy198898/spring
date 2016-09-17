package jpa.interfaces;

import jpa.entity.AccessUsers;

import java.util.List;

/**
 * Created by jeremy on 2016/9/14.
 */
public interface IAccessUser extends IRepository<AccessUsers> {
    String sayHi();

    List<AccessUsers> getAllUsers();
}
