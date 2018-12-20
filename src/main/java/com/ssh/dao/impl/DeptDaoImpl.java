package com.ssh.dao.impl;

import com.ssh.dao.IDeptDao;
import com.ssh.entity.Dept;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wu on 2018/12/20.
 */
@Repository("deptDao")
public class DeptDaoImpl implements IDeptDao {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;


    public List<Dept> getList() {
        Session session = sessionFactory.getCurrentSession();
        List<Dept> list = session.createQuery("select d from Dept d left join d.emps").list();
        return list;
    }
}
