package controllers;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.UserService;

import java.util.List;

/**
 * Created by jeremy on 2016/8/3.
 */
@Controller
@RequestMapping("/entity")
public class EntityTests
{
    @Autowired
    private UserService userService;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(ModelMap attr)
    {
        List<User> users = userService.allUsers();
        String s = "";
        for (User user : users)
        {
            s +=user.getUsername()+" ";
        }
        attr.addAttribute("name", s);
        return "test";
    }
}
