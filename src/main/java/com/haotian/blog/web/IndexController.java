package com.haotian.blog.web;

//import javassist.NotFoundException;
import com.haotian.blog.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        //test error
//        int i = 9/0;

        String blog =null;
        if(blog ==null){
            throw new NotFoundException("Cant find blog");
        }

        return "index";
    }
}
