package com.minderliu.service.impl;

import com.minderliu.dao.FundMapper;
import com.minderliu.entity.Fund;
import com.minderliu.entity.FundKey;
import com.minderliu.service.IFundService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/5/10.
 */
@Service
public class FundServiceImpl implements IFundService{

    @Resource
    private FundMapper fundMapper;



    public Fund selectByPrimaryKey(FundKey key) {
        return fundMapper.selectByPrimaryKey(key);
    }
}
