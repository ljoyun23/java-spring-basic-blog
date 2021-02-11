package com.pluralsight.blog;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    @RequestMapping("/")
    public String listPosts(ModelMap mmap) {
        mmap.put("title", "Blog Post 1");
        return "home";
    }
}
