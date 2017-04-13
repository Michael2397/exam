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
 * 2017年4月14日
 */
public class HelloAction extends ActionSupport {
	public String execute(){
		System.out.println("正在处理");
		return "success";
	}
}
