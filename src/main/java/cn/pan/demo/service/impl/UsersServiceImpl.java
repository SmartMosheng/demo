package cn.pan.demo.service.impl;

import cn.pan.demo.entity.Users;
import cn.pan.demo.mapper.UsersMapper;
import cn.pan.demo.service.UsersService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("usersService")
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersMapper usersMapper;

    @Override
    public Users usersLogin(String account, String password) {
        Users users = usersMapper.login(account,password);
        return users;
    }

    @Override
    public List<Users> search(String account) {
        List<Users> list = usersMapper.query(account);
        return list;
    }

    @Override
    public void remove(String id) {
        usersMapper.delete(id);
    }

    @Override
    public void add(Users users) {
        usersMapper.insert(users);
    }
}
