package com.bspage.browserstartpage.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
@AllArgsConstructor
public class HomeController {

    @PostMapping
    public void saveCategory(){

    }

    @PutMapping
    public void updateCategory(){

    }

    @DeleteMapping
    public void deleteCategory(){

    }

}
