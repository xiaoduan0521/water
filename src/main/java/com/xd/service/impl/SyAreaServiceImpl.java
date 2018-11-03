package com.xd.service.impl;

import com.xd.entity.SyArea;
import com.xd.mapper.SyAreaMapper;
import com.xd.service.SyAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("SyArea")
@Transactional(propagation = Propagation.REQUIRED)
public class SyAreaServiceImpl implements SyAreaService {

    @Autowired
    private SyAreaMapper sam;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sam.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SyArea record) {
        return sam.insert(record);
    }

    @Override
    public int insertSelective(SyArea record) {
        return sam.insertSelective(record);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public SyArea selectByPrimaryKey(Integer id) {
        return sam.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SyArea record) {
        return sam.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SyArea record) {
        return sam.updateByPrimaryKey(record);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<SyArea> selectAll() {
        return sam.selectAll();
    }
}
