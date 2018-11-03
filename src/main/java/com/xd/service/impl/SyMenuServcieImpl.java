package com.xd.service.impl;

import com.xd.entity.SyMenu;
import com.xd.mapper.SyMenuMapper;
import com.xd.service.SyMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("SyMenu")
@Transactional(propagation = Propagation.REQUIRED)
public class SyMenuServcieImpl implements SyMenuService {
    @Autowired
    private SyMenuMapper smm;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return smm.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SyMenu record) {
        return smm.insert(record);
    }

    @Override
    public int insertSelective(SyMenu record) {
        return smm.insertSelective(record);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public SyMenu selectByPrimaryKey(Integer id) {
        return smm.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SyMenu record) {
        return smm.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SyMenu record) {
        return smm.updateByPrimaryKey(record);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<SyMenu> selectAll() {
        return smm.selectAll();
    }
}
