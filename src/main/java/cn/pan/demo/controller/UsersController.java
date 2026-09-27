package cn.pan.demo.controller;

import cn.pan.demo.entity.Users;
import cn.pan.demo.service.UsersService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
//@ResponseBody
@CrossOrigin
@RestController
@RequestMapping("users")
public class UsersController {
    @Resource
    private UsersService usersService;
    //登录
    @RequestMapping("/login")
    public Users login(String name,String pass)
    {
        Users users = usersService.usersLogin(name,pass);
        return users;
    }

    @RequestMapping(value = "/find")
    public PageInfo<Users> find(
            String qname,
            @RequestParam(defaultValue = "1") Integer cp,
            @RequestParam(defaultValue = "5") Integer pageSize)
    {

        PageHelper.startPage(cp,pageSize);
        List<Users> usersList = usersService.search(qname);
        PageInfo<Users> pageInfo = new PageInfo(usersList);
        return pageInfo;
    }
    @RequestMapping(value = "/del")
    public void delete(String id)
    {
        usersService.remove(id);
    }
    @RequestMapping(value = "/save")
    public void save(@RequestBody Users users)
    {
        usersService.add(users);
    }

}
