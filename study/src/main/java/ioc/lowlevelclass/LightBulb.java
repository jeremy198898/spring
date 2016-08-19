package ioc.lowlevelclass;

import ioc.inf.Switchable;

/**
 * Created by jeremy on 2016/8/19.
 */
public class LightBulb implements Switchable
{
    @Override
    public void turnOn()
    {
        System.out.println("Bulb turned on...");
    }

    @Override
    public void turnOff()
    {
        System.out.println("Bulb turned off...");
    }
}
