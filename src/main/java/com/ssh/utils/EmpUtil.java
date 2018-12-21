package com.ssh.utils;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;

import java.math.BigDecimal;
import java.util.Date;


/**
 * Created by wu on 2018/12/21.
 */
@ExcelTarget("empUtil")
public class EmpUtil{

    @Excel(name = "员工姓名", width = 30, groupName = "基本信息")
    private String empName;

    @Excel(name = "员工姓名", width = 30, type = 10, groupName = "基本信息")
    private Integer age;

    @Excel(name = "入职时间", width = 30, groupName = "工作信息", format = "yyyy/MM/dd HH:mm")
    private Date hiredate;

    @Excel(name = "薪酬", width = 30, type = 10, groupName = "工作信息")
    private BigDecimal Salary;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public BigDecimal getSalary() {
        return Salary;
    }

    public void setSalary(BigDecimal salary) {
        Salary = salary;
    }
}
