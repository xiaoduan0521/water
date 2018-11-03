package com.xd.service.impl;

import com.xd.entity.SyEmp;
import com.xd.mapper.SyEmpMapper;
import com.xd.service.SyEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service("SyEmp")
@Transactional(propagation = Propagation.REQUIRED)
public class SyEmpServiceImpl implements SyEmpService {
    @Autowired
    private SyEmpMapper sem;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sem.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SyEmp record) {
        return sem.insert(record);
    }

    @Override
    public int insertSelective(SyEmp record) {
        return sem.insertSelective(record);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public SyEmp selectByPrimaryKey(Integer id) {
        return sem.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SyEmp record) {
        return sem.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SyEmp record) {
        return sem.updateByPrimaryKey(record);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public SyEmp login(Map<String, String> map) {
        return sem.login(map);
    }

    @Override
    public List<SyEmp> selectByPageAll(Map<String, Object> map) {
        return sem.selectByPageAll(map);
    }

    @Override
    public int getPageCount(Map<String, Object> map) {
        return sem.getPageCount(map);
    }
}
