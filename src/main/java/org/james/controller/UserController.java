package org.james.controller;

import java.util.List;
import org.james.entity.User;
import org.james.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping
  public List<User> selectAll() {
    return userService.selectAll();
  }

  @GetMapping("/{id}")
  public User selectByPrimaryKey(@PathVariable Integer id) {
    return userService.selectByPrimaryKey(id);
  }

  @PostMapping
  public String insert(@RequestBody User user) {
    userService.insert(user);
    return "Success. Id: " + user.getId();
  }

  @DeleteMapping("/{id}")
  public String delete(@PathVariable Integer id) {
    userService.deleteByPrimaryKey(id);
    return "Success";
  }

  @PutMapping
  public String update(@RequestBody User user) {
    userService.updateByPrimaryKey(user);
    return "Success";
  }
}
