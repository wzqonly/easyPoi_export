package com.ssh.service.impl;

import com.ssh.dao.IDeptDao;
import com.ssh.entity.Dept;
import com.ssh.service.IExportService;
import com.ssh.utils.DeptUtil;
import com.ssh.utils.EmpUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

/**
 * Created by wu on 2018/12/20.
 */
@Service("exportService")
public class ExportServiceImpl implements IExportService {

    @Resource
    private IDeptDao deptDao;

    // 注入事务管理
    @Transactional(rollbackFor={Exception.class, RuntimeException.class})
    public List<DeptUtil> exportList() {
        List<DeptUtil> deptList = new ArrayList<>();
        try {
            List<Dept> list = deptDao.getList();
            HashSet<Dept> depts = new HashSet<>(list);  //去重
            depts.stream().forEach(
                    a -> {
                        DeptUtil deptUtil = new DeptUtil();
                        deptUtil.setId(a.getId());
                        deptUtil.setDeptName(a.getDeptName());
                        List<EmpUtil> empList = new ArrayList<>();
                        a.getEmps().stream().forEach(
                                b -> {
                                    EmpUtil empUtil = new EmpUtil();
                                    empUtil.setAge(b.getAge());
                                    empUtil.setEmpName(b.getEmpName());
                                    empUtil.setHiredate(new Date());
                                    empUtil.setSalary(new BigDecimal(1000).add(new BigDecimal((int) (Math.random() * 90 + 10))));
                                    empList.add(empUtil);
                                }
                        );
                        deptUtil.setEmps(empList);
                        deptList.add(deptUtil);
                    }

            );
        }catch (Exception e){
            e.printStackTrace();
        }
        return deptList;
    }
}
