package com.jeecms.rc.test.service.impl;

import com.jeecms.core.entity.CmsRole;
import com.jeecms.rc.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jeecms.rc.test.dao.UserDao;
import java.util.List;

@Service
public class UserServiceimpl implements UserService {
    @Override
    public List<CmsRole> getRole() {
        return UserDao.getList();
    }
    @Autowired
    private UserDao UserDao;
}
