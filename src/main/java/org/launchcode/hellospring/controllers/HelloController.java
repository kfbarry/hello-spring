package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }

//    @GetMapping("goodbye")
//    public String goodbye(){
//        return "Goodbye, Spring!";
//    }
//
//    //handles request of form /hello?name=launchCode;
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//    public String helloWithQueryParam(@RequestParam String name){
//        return "Hello, " + name + "!";
//    }
//
//    //handles request of form /hello/LaunchCode
//    @GetMapping("{name}")
//    public String helloWithPathParam(@PathVariable String name){
//        return "Hello, " + name + "!";
//    }

    @RequestMapping(value="hello", method={RequestMethod.GET,RequestMethod.POST})
    public String createMessage(@RequestParam String name, @RequestParam String language){
        if (language.equals("english")){
            return "Hello " + name + "!";
        } else if (language.equals("spanish")){
            return "Hola " + name + "!";
        } else if (language.equals("french")){
            return "Salut " + name + "!";
        } else if (language.equals("german")){
            return "Hallo " + name + "!";
        } else {
            return "Ciao " + name + "!";
        }
    }

    @GetMapping("form")
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='hello' >" + // submit request to /hello
                "<input type='text' name='name'>" +
                "<select name='language' id='language-select>" +
                "<option value='english' selected>English</option>" +
                "<option value='spanish'>Spanish</option>" +
                "<option value='french'>French</option>" +
                "<option value='german'>German</option>" +
                "<option value='italian'>Italian</option>" +
                "<input type='submit' value='Greet Me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
