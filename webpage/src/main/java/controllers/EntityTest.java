package controllers;

import dao.IEntityTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.EntityTestService;

/**
 * Created by jeremy on 2016/8/3.
 */
@Controller
@RequestMapping("/entity")
public class EntityTest
{
    //@Autowired
    //private IEntityTest entityTest;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(ModelMap attr)
    {
        //String test = entityTest.sayHi();
        //System.out.println(test);
        return "test";
    }
}
