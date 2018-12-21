package com.ssh.utils;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import java.util.List;

/**
 * Created by wu on 2018/12/20.
 */
@ExcelTarget("deptUtil")
public class DeptUtil {

    @Excel(name = "部门编号", width = 30 , needMerge = true)
    private Integer id;

    @Excel(name = "部门名称", width = 30 , needMerge = true)
    private String deptName;

    @ExcelCollection(name = "员工信息")
    private List<EmpUtil> emps;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<EmpUtil> getEmps() {
        return emps;
    }

    public void setEmps(List<EmpUtil> emps) {
        this.emps = emps;
    }
}
