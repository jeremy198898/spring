package impl;

import interfaces.IService;
import org.springframework.stereotype.Component;

/**
 * Created by jeremy on 2016/8/11.
 */
@Component
public class ServiceTest implements IService
{
    @Override
    public void sayHi()
    {
        System.out.println("hello,you damn!");
    }
}
