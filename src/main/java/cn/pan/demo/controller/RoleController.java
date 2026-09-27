package cn.pan.demo.controller;

import cn.pan.demo.entity.Role;
import cn.pan.demo.service.RoleService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("roles")
public class RoleController {
    @Resource
    private RoleService roleService;
    @RequestMapping(value = "/find")
    public List<Role> find()
    {
        List<Role> roleList = roleService.query();
        return roleList;
    }
    @RequestMapping(value = "/delete")
    public String delete()
    {
        return "hello delete";
    }
}
