package cn.pan.demo.service.impl;

import cn.pan.demo.entity.Role;
import cn.pan.demo.mapper.RoleMapper;
import cn.pan.demo.service.RoleService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("roleService")
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleMapper roleMapper;
    @Override
    public List<Role> query() {
        return roleMapper.get();
    }
}
