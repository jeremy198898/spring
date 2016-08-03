package service;

import dao.IEntityTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jeremy on 2016/8/3.
 */
@Component
public class EntityTestService
{
    private IEntityTest entityTest;

    @Autowired
    public EntityTestService(IEntityTest entityTest)
    {
        this.entityTest = entityTest;
    }

    public String sayHi()
    {
        return entityTest.sayHi();
    }
}
