package com.ty.boot.springboot_trainer_demo.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Items {

	@Id
	private int id;
	private String name;
	private long cost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}
	
}
