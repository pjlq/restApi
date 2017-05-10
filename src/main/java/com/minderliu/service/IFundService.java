package com.minderliu.service;

import com.minderliu.entity.Fund;
import com.minderliu.entity.FundKey;

import java.util.List;

/**
 * Created by Administrator on 2017/5/10.
 */

public interface IFundService {
    Fund selectByPrimaryKey(FundKey key);
}
