package com.xd.service.impl;

import com.xd.entity.SyDept;
import com.xd.mapper.SyDeptMapper;
import com.xd.service.SyDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("SyDept")
@Transactional(propagation = Propagation.REQUIRED)
public class SyDeptServiceImpl implements SyDeptService {

    @Autowired
    private SyDeptMapper sdm;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sdm.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SyDept record) {
        return sdm.insert(record);
    }

    @Override
    public int insertSelective(SyDept record) {
        return sdm.insertSelective(record);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public SyDept selectByPrimaryKey(Integer id) {
        return sdm.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SyDept record) {
        return sdm.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SyDept record) {
        return sdm.updateByPrimaryKey(record
        );
    }
    @Override
    public List<SyDept> selectAll() {
        return sdm.selectAll();
    }

    @Override
    public List<SyDept> selectByDisabledToSelect() {
        return sdm.selectByDisabledToSelect();
    }
}
