package com.xd.service.impl;

import com.xd.entity.SyMetertype;
import com.xd.mapper.SyMetertypeMapper;
import com.xd.service.SyMetertypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("SyMetertype")
@Transactional(propagation = Propagation.REQUIRED)
public class SyMetertypeServiceImpl implements SyMetertypeService {
    @Autowired
    private SyMetertypeMapper smm;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return smm.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SyMetertype record) {
        return smm.insert(record);
    }

    @Override
    public int insertSelective(SyMetertype record) {
        return smm.insertSelective(record);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public SyMetertype selectByPrimaryKey(Integer id) {
        return smm.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SyMetertype record) {
        return smm.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SyMetertype record) {
        return smm.updateByPrimaryKey(record);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<SyMetertype> selectAll() {
        return smm.selectAll();
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<SyMetertype> selectByDisabledYes() {
        return smm.selectByDisabledYes();
    }
}
