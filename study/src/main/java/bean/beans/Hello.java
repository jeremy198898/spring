package bean.beans;

import bean.inf.IHello;
import org.springframework.stereotype.Component;

/**
 * Created by jeremy on 2016/8/19.
 */
@Component
public class Hello implements IHello
{
    @Override
    public String say()
    {
        String sth = "This world is in Chaos.";
        return sth;
    }
}
