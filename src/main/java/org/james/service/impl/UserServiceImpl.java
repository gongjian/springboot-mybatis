package org.james.service.impl;

import java.util.List;
//import org.james.dao.AnnonationUserMapper;
import org.james.dao.UserMapper;
import org.james.entity.User;
import org.james.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

  @Autowired
  private UserMapper userMapper;
  
  //@Autowired
  //private AnnonationUserMapper annonationUserMapper;

  @Override
  public int insert(User user) {
    return userMapper.insert(user);
  }

  @Override
  public List<User> selectAll() {
    return userMapper.selectAll();
  }

  @Override
  public User selectByPrimaryKey(Integer id) {
    return userMapper.selectByPrimaryKey(id);
  }

  @Override
  public int deleteByPrimaryKey(Integer id) {
    return userMapper.deleteByPrimaryKey(id);
  }

  @Override
  public int updateByPrimaryKey(User user) {
    return userMapper.updateByPrimaryKey(user);
  }
  
}
