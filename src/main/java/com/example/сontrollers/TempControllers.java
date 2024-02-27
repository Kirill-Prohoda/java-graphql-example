package com.example.сontrollers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempControllers implements ErrorController {


  @GetMapping("/test")
  public String Test(){
    return "test";
  }
}
