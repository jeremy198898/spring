package ioc;

import ioc.inf.Switchable;
import ioc.lowlevelclass.LightBulb;
import org.junit.Test;

/**
 * Created by jeremy on 2016/8/19.
 */
public class TestIoc
{
    @Test
    public void test()
    {
        //turn on lightbulb
        Switchable bulb = new LightBulb();
        PowerSwitch control = new PowerSwitch(bulb);
        control.press();
        control.press();
    }
}
