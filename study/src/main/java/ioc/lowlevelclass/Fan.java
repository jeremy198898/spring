package ioc.lowlevelclass;

import ioc.inf.Switchable;

/**
 * Created by jeremy on 2016/8/19.
 */
public class Fan implements Switchable
{

    @Override
    public void turnOn()
    {
        System.out.println("Fan turned on...");
    }

    @Override
    public void turnOff()
    {
        System.out.println("Fan turned off...");
    }
}
