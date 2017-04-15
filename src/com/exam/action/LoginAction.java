/**
 * 
 */
package com.exam.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author michael
 * Description: 
 *
 *
 * 2017年4月15日
 */
public class LoginAction extends ActionSupport {
	private String name;

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String execute() throws Exception{
		System.out.println("姓名是："+name);
		if("李达康".equals(name)){
			return "teacher";
		}
		else {
			return "student";
		}		
	}
}
