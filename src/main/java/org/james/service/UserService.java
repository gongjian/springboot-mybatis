package org.james.service;

import java.util.List;
import org.james.entity.User;

public interface UserService {

  int insert(User user);

  List<User> selectAll();

  User selectByPrimaryKey(Integer id);

  int deleteByPrimaryKey(Integer id);

  int updateByPrimaryKey(User user);

}
