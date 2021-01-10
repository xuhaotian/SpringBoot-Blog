package com.haotian.blog.web;

//import javassist.NotFoundException;
import com.haotian.blog.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {
    @GetMapping("/{id}/{name}")


    public String index(@PathVariable Integer id, @PathVariable String name) {
        //test error
//        int i = 9/0;
//        String blog =null;
//        if(blog ==null){
//            throw new NotFoundException("Cant find blog");
//        }

        System.out.println("------------index------------");
        return "index";
    }
}
