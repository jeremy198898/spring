package service;

import daoimpl.EntityTestImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jeremy on 2016/8/3.
 */
@Component
public class EntityTestService
{
    @Autowired
    private EntityTestImpl entityTest;

    public String sayHi()
    {
        return entityTest.sayHi();
    }
}
