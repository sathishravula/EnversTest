package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ehc on 14/11/16.
 */
@RestController
public class TestController {
  @Autowired
  UserRepository userRepository;

  @RequestMapping("/welcome")
  public Object welcome() {
    return "Welcome to Envers";
  }

  @RequestMapping("/create")
  public Object create() {
    User user = new User();
    user.setFirstName("Sathish");
    user.setLastName("Ravula");
    userRepository.save(user);
    return "Created successfully";
  }

  @RequestMapping("/update")
  public Object update(@RequestParam("last_name") String lastName,
                       @RequestParam("id") Long id) {
    User user = userRepository.findOne(id);
    user.setLastName(lastName);
    userRepository.save(user);
    return "Updated successfully";
  }

}
