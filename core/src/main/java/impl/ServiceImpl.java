package impl;

import interfaces.IService;
import org.springframework.stereotype.Component;

/**
 * Created by jeremy on 2016/8/10.
 */
@Component
public class ServiceImpl implements IService
{
    @Override
    public void sayHi()
    {
        System.out.println("Hello,you motherfucker!");
    }
}
