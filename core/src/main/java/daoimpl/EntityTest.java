package daoimpl;

import dao.IEntityTest;

public class EntityTest implements IEntityTest
{

    @Override
    public String sayHi()
    {
        return "hi,I am here!";
    }
}
