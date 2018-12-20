package com.ssh.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by wu on 2018/12/20.
 */
@Entity
public class Emp {
    private int id;
    private String empName;
    private Integer age;
    private Dept dept;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "empName")
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Basic
    @Column(name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Basic
    @Column(name = "dept_id")


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Emp emp = (Emp) o;

        if (id != emp.id) return false;
        if (empName != null ? !empName.equals(emp.empName) : emp.empName != null) return false;
        if (age != null ? !age.equals(emp.age) : emp.age != null) return false;
        if (dept != null ? !dept.equals(emp.dept) : emp.dept != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (empName != null ? empName.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (dept != null ? dept.hashCode() : 0);
        return result;
    }
}
