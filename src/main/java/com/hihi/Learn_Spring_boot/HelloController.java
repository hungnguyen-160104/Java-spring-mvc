package com.hihi.Learn_Spring_boot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class HelloController {
  @GetMapping("/")
  public String index() {
      return "Hello World !";
  }

}
