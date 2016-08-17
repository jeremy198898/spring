package bean.services;

import bean.beans.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jeremy on 2016/8/16.
 */
@Service
public class ServiceTest
{
    @Autowired
    private ServiceImpl services;

    //injection with setter
//    @Autowired
//    public void setService(ServiceImpl services)
//    {
//        this.services = services;
//    }

    public void sayHi()
    {
        services.sayHi();
    }

}
