package com.example.employee1;

public class Employee {
int eno;
String ename;
String dept;
public int getEno() {
	return eno;
}
public void setEno(int eno) {
	this.eno = eno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "Employee [eno=" + eno + ", ename=" + ename + ", dept=" + dept + "]";
}
public Employee(int eno, String ename, String dept) {
	super();
	this.eno = eno;
	this.ename = ename;
	this.dept = dept;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

}
