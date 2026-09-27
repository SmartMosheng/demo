package cn.pan.demo.service;

import cn.pan.demo.entity.Users;

import java.util.List;

public interface UsersService {
    public Users usersLogin(String account,String password);
    public List<Users> search(String account);

    public void remove(String id);

    public void add(Users users);
}
