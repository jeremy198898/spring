package daoimpl;

import dao.IEntityTest;

/**
 * Created by jeremy on 2016/8/4.
 */
public class EntityTestImpl implements IEntityTest
{
    @Override
    public String sayHi()
    {
        return "Hi,lady, how about dinner tonight!!";
    }
}
