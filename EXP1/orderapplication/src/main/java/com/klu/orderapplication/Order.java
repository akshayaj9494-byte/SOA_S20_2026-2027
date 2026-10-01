
package com.klu.orderapplication;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	@Id
	int oid;
	int uid;
	int rid;
	String item;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "Class [oid=" + oid + ", uid=" + uid + ", rid=" + rid + ", item=" + item + "]";
	}
	public Order(int oid, int uid, int rid, String item) {
		super();
		this.oid = oid;
		this.uid = uid;
		this.rid = rid;
		this.item = item;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
