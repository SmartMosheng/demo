package cn.pan.demo.controller;

import cn.pan.demo.entity.SupplierCount;
import cn.pan.demo.service.SupplierService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("supplier")
public class SupplierController {
    @Resource
    private SupplierService supplierService;
    @RequestMapping(value = "/findYearCount")
    public List<SupplierCount> findYearCount()
    {
        List<SupplierCount> supplierCountList = supplierService.query();
        return supplierCountList;
    }
}
