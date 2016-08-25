package bean.services;

import bean.inf.IHello;
import bean.inf.IService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by jeremy on 2016/8/16.
 */
@Service
public class ServiceTest implements IService
{
    // @Autowired is almost the same with @Inject
    @Inject
    private IHello hello;

    //injection with setter
//    @Autowired
//    public void setService(ServiceImpl services)
//    {
//        this.services = services;
//    }

    @Override
    public void sayHi()
    {
        String test = hello.say();
        System.out.println(test);
    }

}
