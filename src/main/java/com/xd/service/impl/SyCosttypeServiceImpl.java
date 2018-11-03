package com.xd.service.impl;

import com.xd.entity.SyCosttype;
import com.xd.mapper.SyCosttypeMapper;
import com.xd.service.SyCosttypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("SyCosttype")
@Transactional(propagation = Propagation.REQUIRED)
public class SyCosttypeServiceImpl implements SyCosttypeService {
    @Autowired
    private SyCosttypeMapper scm;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return scm.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SyCosttype record) {
        return scm.insert(record);
    }

    @Override
    public int insertSelective(SyCosttype record) {
        return scm.insertSelective(record);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public SyCosttype selectByPrimaryKey(Integer id) {
        return scm.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SyCosttype record) {
        return scm.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SyCosttype record) {
        return scm.updateByPrimaryKey(record);
    }
}
