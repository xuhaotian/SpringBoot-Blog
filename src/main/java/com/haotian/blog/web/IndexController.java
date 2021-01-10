package com.haotian.blog.web;

import com.haotian.blog.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {


    @GetMapping("/")
//    public String index(@PathVariable Integer id, @PathVariable String name) {
    public String index() {
        //test error
//        int i = 9/0;
//        String blog =null;
//        if(blog ==null){
//            throw new NotFoundException("Cant find blog");
//        }
//        System.out.println("------------index------------");
        return "index";
    }

    @GetMapping("/blog")
    public String blog() {
//        System.out.println("------------blog------------");
        return "blog";
    }

    @GetMapping("/categories")
    public String categories() {
        return "categories";
    }

    @GetMapping("/tags")
    public String tags() {
        return "tags";
    }

    @GetMapping("/archives")
    public String archives() {
        return "archives";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
