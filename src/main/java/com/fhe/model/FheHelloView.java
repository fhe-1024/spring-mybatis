package com.fhe.model;

import java.sql.Timestamp;

public class FheHelloView {
	private long id;
	private String username;
	private String password;
	private double money;
	private Timestamp createtime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public Timestamp getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	@Override
	public String toString() {
		return "FheHelloView [id=" + id + ", username=" + username + ", password=" + password + ", money=" + money
				+ ", createtime=" + createtime + "]";
	}

}
