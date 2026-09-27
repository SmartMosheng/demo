package cn.pan.demo.service.impl;

import cn.pan.demo.entity.SupplierCount;
import cn.pan.demo.mapper.SupplierMapper;
import cn.pan.demo.service.SupplierService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("supplierService")
public class SupplierServiceImpl implements SupplierService {
    @Resource
    private SupplierMapper supplierMapper;
    @Override
    public List<SupplierCount> query() {
        return supplierMapper.getCount();
    }
}
