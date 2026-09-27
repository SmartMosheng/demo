package cn.pan.demo.mapper;

import cn.pan.demo.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface UsersMapper {
    public Users login(@Param("account") String account,@Param("password") String password);
    public List<Users> query(@Param("account") String account);

    public void delete(@Param("id") String id);

    public void insert(Users users);
}
