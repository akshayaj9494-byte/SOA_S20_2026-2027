package com.klu.cartapplication;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cart {
	@Id
	int cid;
	int pid;
	int qty;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Cart [cid=" + cid + ", pid=" + pid + ", qty=" + qty + "]";
	}
	public Cart(int cid, int pid, int qty) {
		super();
		this.cid = cid;
		this.pid = pid;
		this.qty = qty;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
