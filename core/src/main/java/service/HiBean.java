package service;

import org.springframework.stereotype.Component;

/**
 * Created by jeremy on 2016/8/4.
 */
@Component
public class HiBean {

    public String sayHi()
    {
        return "hello";
    }
}
