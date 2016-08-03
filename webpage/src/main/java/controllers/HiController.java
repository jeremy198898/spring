package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jeremy on 2016/8/3.
 */
@Controller
@RequestMapping("/")
public class HiController
{
    @RequestMapping(method = RequestMethod.GET)
    public String sayHi(ModelMap model)
    {
        model.addAttribute("hi", "Hello you damn SpringMVC!");
        return "hi";
    }

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(ModelMap map)
    {
        map.addAttribute("name", "This is test");
        return "test";
    }
}
