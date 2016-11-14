package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ehc on 14/11/16.
 */
@RestController
public class TestController {
  @RequestMapping("/welcome")
  public Object welcome(){
    return "Welcome to Envers";
  }
}
