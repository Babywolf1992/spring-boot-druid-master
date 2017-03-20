package com.babywolf.service;

import com.babywolf.entity.UserInfo;
import com.babywolf.mapper.UserInfoMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by babywolf on 17/3/19.
 */
@Service
public class UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    public List<UserInfo> getAll(UserInfo userInfo) {
        if (userInfo.getPage() != null && userInfo.getRows() != null) {
            PageHelper.startPage(userInfo.getPage(), userInfo.getRows());
        }
        return userInfoMapper.selectAll();
    }

    public UserInfo getById(Integer id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {
        userInfoMapper.deleteByPrimaryKey(id);
    }

    public void save(UserInfo userInfo) {
        if (userInfo.getId() != null) {
            userInfoMapper.updateByPrimaryKey(userInfo);
        }else {
            userInfoMapper.insert(userInfo);
        }
    }
}
