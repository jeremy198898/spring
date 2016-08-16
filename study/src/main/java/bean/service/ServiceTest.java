package bean.service;

import bean.beans.ServiceImpl;
import bean.infs.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jeremy on 2016/8/16.
 */
@Service
public class ServiceTest
{
    private ServiceImpl service;

    @Autowired
    public void setService(ServiceImpl service)
    {
        this.service = service;
    }

    public void sayHi()
    {
        service.sayHi();
    }
}
