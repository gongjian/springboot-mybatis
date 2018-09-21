package org.james.dao;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.james.entity.User;

public interface AnnonationUserMapper {

  @Select("select * from user")
  @Results({
    @Result(property="id", column="id"),
    @Result(property="name", column="name"),
    @Result(property="sex", column="sex"),
    @Result(property="age", column="age")
})
  List<User> selectAll();

  @Select("select * from user where id = #{id}")
  @Results({
      @Result(property="id", column="id"),
      @Result(property="name", column="name"),
      @Result(property="sex", column="sex"),
      @Result(property="age", column="age")
  })
  User selectByPrimaryKey(Integer id);

  @Insert("insert into user(name, sex, age) values (#{name}, #{sex}, #{age})")
  int insert(User user);

  @Update("update user set name = #{name}, sex = #{sex}, age = #{age} where id = #{id} ")
  int updateByPrimaryKey(User user);

  @Delete("delete from user where id = #{id}")
  int deleteByPrimaryKey(Integer id);

}
