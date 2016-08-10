package service;

import impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jeremy on 2016/8/10.
 */
@Service
public class ServiceTest
{
    @Autowired
    private ServiceImpl service;

    public void doit()
    {
        service.sayHi();
    }
}
