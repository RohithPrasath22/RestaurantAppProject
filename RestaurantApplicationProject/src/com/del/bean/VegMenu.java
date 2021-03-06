package com.del.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="veg")
public class VegMenu {
	@Id

	private int id;
	private String dishname;
	private int quant;
	private int price;
	public VegMenu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VegMenu(int id, String dishname, int quant, int price) {
		super();
		this.id = id;
		this.dishname = dishname;
		this.quant = quant;
		this.price = price;
	}
	@Override
	public String toString() {
		return "\nvegMenu [id=" + id + ", dishname=" + dishname + ", quant=" + quant + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDishname() {
		return dishname;
	}
	public void setDishname(String dishname) {
		this.dishname = dishname;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
