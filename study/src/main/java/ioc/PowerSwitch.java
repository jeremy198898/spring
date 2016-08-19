package ioc;

import ioc.inf.Switch;
import ioc.inf.Switchable;

/**
 * Created by jeremy on 2016/8/19.
 * A. High-level modules should not depend on low-level modules. Both should depend on abstractions.
 *B. Abstractions should not depend on details. Details should depend on abstractions.
 * abstractions could be interface or abstract class
 */
public class PowerSwitch implements Switch
{
    private Switchable client;
    public boolean on;

    public PowerSwitch(Switchable client)
    {
        this.client = client;
    }

    @Override
    public boolean isOn()
    {
        return this.on;
    }

    @Override
    public void press()
    {
        boolean  check = isOn();
        if(check){
            client.turnOff();
            this.on = false;
        }else {
            client.turnOn();
            this.on = true;
        }
    }
}
