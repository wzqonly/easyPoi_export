package com.ssh.service.impl;

import com.ssh.dao.IDeptDao;
import com.ssh.entity.Dept;
import com.ssh.service.IExportService;
import com.ssh.utils.ExportUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wu on 2018/12/20.
 */
@Service
public class ExportServiceImpl implements IExportService {

    @Resource
    private IDeptDao deptDao;

    // 注入事务管理
    @Transactional(rollbackFor={Exception.class, RuntimeException.class})
    public List<ExportUtil> exportList() {
        List<Dept> list = deptDao.getList();
        return null;
    }
}
