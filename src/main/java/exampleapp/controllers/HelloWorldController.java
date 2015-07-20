package exampleapp.controllers;

import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Chris on 20/07/2015.
 */
@Controller
public class HelloWorldController
{

    @RequestMapping("/helloworld")
    public String helloworld(HttpServletRequest request,HttpServletResponse response)
    {
        return "helloworld";
    }

    @RequestMapping("/goodbyeworld")
    public String goodbyeworld(HttpServletRequest request, HttpServletResponse response) {
        return "goodbyeworld";
    }
}
