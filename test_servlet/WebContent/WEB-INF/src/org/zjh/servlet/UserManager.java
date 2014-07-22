package org.zjh.servlet;

import java.util.*;

public class UserManager {
	public void add(String name){
		System.out.println("add " + name);
	}
	
	public void del(String name){
		System.out.println("del " + name);
	}
	
	public void modify(String name){
		System.out.println("modify " + name);
	}
	
	public List query(String name){
		System.out.println("query " + name);
		List userList = new ArrayList();
		userList.add("A");
		userList.add("B");
		userList.add("C");
		return userList;
	}
}
