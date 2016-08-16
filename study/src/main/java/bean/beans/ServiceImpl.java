package bean.beans;

import bean.infs.IService;
import org.springframework.stereotype.Component;

/**
 * Created by jeremy on 2016/8/16.
 */
@Component
public class ServiceImpl implements IService
{

    @Override
    public void sayHi()
    {
        System.out.println("Hello,this is fucking test!");;
    }
}
