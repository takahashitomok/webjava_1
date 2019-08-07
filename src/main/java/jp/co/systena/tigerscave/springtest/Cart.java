package jp.co.systena.tigerscave.springtest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;

public class Cart {
	public List<Order> orderList;

    Cart(){
    	orderList = new ArrayList<Order>();
    }

    public void setOrderList(List<Order> orderList) {
    	this.orderList = orderList;
    }

    public List<Order> getOrderList(){
    	return orderList;
    }
}