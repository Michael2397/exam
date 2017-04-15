/**
 * 
 */
package com.exam.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.exam.util.JdbcUtil;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.Result;

/**
 * @author michael
 * Description: 
 *
 *
 * 2017年4月15日
 */
public class CommonAction {
	public void requestKey() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		//从前端接受到的请求
		String content = request.getParameter("content");
		System.out.println(content);
		content = content.trim();
		Connection con = JdbcUtil.getConnection();
		Statement statement = con.createStatement();
		String sql = "select keyID,keyvalue from "+content+"key";
		System.out.println(sql);
		ResultSet rs =  statement.executeQuery(sql);
		String str = "";
		while(rs.next()){
			String id = rs.getString(1);
			String key = rs.getString(2);
			str = str+"['"+id+"','"+key+"'],";
		}
		str = str.substring(0,str.length()-1);
		System.out.println(str);
		//返回正确的格式
		String results = "{ id:'table', header:['题号','答案'], data:["+str+"]}";
		response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(results); 
		
	}
	
}
