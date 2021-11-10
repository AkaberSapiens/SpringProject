package com.sapiens.springMVC;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/contact")
    public String contact_details(){
        return "This is a contact page";
    }

    @RequestMapping("/About")
    public String company_details(){
        return "This is about us page";
    }

    @RequestMapping("/gallery ")
    public String photo(){
        return "This is a gallery page";
    }

    @RequestMapping("/")
    public String home(){
        return "This is a home page";
    }

}
