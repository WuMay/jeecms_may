package com.jeecms.rc.test.dao.impl;

import com.jeecms.common.hibernate4.Finder;
import com.jeecms.common.hibernate4.HibernateBaseDao;
import com.jeecms.core.entity.CmsRole;
import com.jeecms.rc.test.dao.UserDao;

import javax.annotation.Resource;
import java.util.List;

@Resource
public class UserDaoimpl extends HibernateBaseDao<CmsRole,Integer> implements UserDao {

    @Override
    protected Class<CmsRole> getEntityClass() {
        return CmsRole.class;
    }

    public List<CmsRole> getList() {
        String hql = "from CmsRole";
        Finder f=Finder.create(hql);
        return find(f);
    }
}
