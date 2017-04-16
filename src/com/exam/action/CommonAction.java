/**
 * 
 */
package com.exam.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
		JdbcUtil.closeAll(con, statement, rs);
		//返回正确的格式
		String results = "{ id:'table', header:['题号','答案'], data:["+str+"]}";
		response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(results); 
		
	}
	
	//直方图
	public void scoreRequest() throws Exception{
		HttpServletResponse response = ServletActionContext.getResponse();		
		ArrayList<String> score = new ArrayList<>();
		Connection con = JdbcUtil.getConnection();
		Statement statement = con.createStatement();

	
		
		
		//大于90分
		String sql1 = "SELECT count(*) from scoretest where  score>90";
		//80-90
		String sql2 = "SELECT count(*) from scoretest where  score>80 and score <90";
		//70-80
		String sql3 = "SELECT count(*) from scoretest where  score>70 and score <80";
		//60-70
		String sql4 = "SELECT count(*) from scoretest where  score>60 and score <70";
		//50-60
		String sql5 = "SELECT count(*) from scoretest where  score>50 and score <60";
		//40-50
		String sql6 = "SELECT count(*) from scoretest where  score>40 and score <50";
		
		
		ResultSet rs6 =  statement.executeQuery(sql6);
		while(rs6.next()){
			score.add(rs6.getString(1));
		}
		
		ResultSet rs5 =  statement.executeQuery(sql5);
		while(rs5.next()){
			score.add(rs5.getString(1));
		}
		
		ResultSet rs4 =  statement.executeQuery(sql4);
		while(rs4.next()){
			score.add(rs4.getString(1));
		}
		
		ResultSet rs3 =  statement.executeQuery(sql3);
		while(rs3.next()){
			score.add(rs3.getString(1));
		}
		
		
		ResultSet rs2 =  statement.executeQuery(sql2);
		while(rs2.next()){
			score.add(rs2.getString(1));
		}
		
		ResultSet rs1 =  statement.executeQuery(sql1);
		while(rs1.next()){
			score.add(rs1.getString(1));
		}
		//[5, 20, 36, 10, 10, 20]
		String result = "[";
		for (int i = 0; i < score.size(); i++) {
			result = result+score.get(i)+",";
		}
		JdbcUtil.closeAll(con, statement, rs1);
		result = result.substring(0, result.length()-1);
		result = result+"]";
		System.out.println(result);
		String option = "option = {tooltip: {trigger: 'axis',axisPointer: {type: 'cross', crossStyle: {color: '#999'}}},toolbox: {feature: {dataView: {show: true, readOnly: false},magicType: {show: true, type: ['line', 'bar']},restore: {show: true},saveAsImage: {show: true}}},legend: { data:['各个分数段的总人数']}, xAxis: [ {type: 'category', data: ['40-50','50-60','60-70','70-80','80-90','90-100'],axisPointer: {type: 'shadow' }}],yAxis: [{type: 'value', name: '人数',} ],series: [ {name:'各个分数段的总人数',type:'bar',data:"+result+"}]}";
		System.out.println("option:"+option);
		String results = option;
		response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(results);
	}
	
	//饼图
	public void scorePieRequest() throws Exception{
		HttpServletResponse response = ServletActionContext.getResponse();		
		ArrayList<String> score = new ArrayList<>();
		Connection con = JdbcUtil.getConnection();
		Statement statement = con.createStatement();

	
		
		
		//大于90分
		String sql1 = "SELECT count(*) from scoretest where  score>90";
		//80-90
		String sql2 = "SELECT count(*) from scoretest where  score>80 and score <90";
		//70-80
		String sql3 = "SELECT count(*) from scoretest where  score>70 and score <80";
		//60-70
		String sql4 = "SELECT count(*) from scoretest where  score>60 and score <70";
		//50-60
		String sql5 = "SELECT count(*) from scoretest where  score>50 and score <60";
		//40-50
		String sql6 = "SELECT count(*) from scoretest where  score>40 and score <50";
		
		
		ResultSet rs6 =  statement.executeQuery(sql6);
		while(rs6.next()){
			score.add(rs6.getString(1));
		}
		
		ResultSet rs5 =  statement.executeQuery(sql5);
		while(rs5.next()){
			score.add(rs5.getString(1));
		}
		
		ResultSet rs4 =  statement.executeQuery(sql4);
		while(rs4.next()){
			score.add(rs4.getString(1));
		}
		
		ResultSet rs3 =  statement.executeQuery(sql3);
		while(rs3.next()){
			score.add(rs3.getString(1));
		}
		
		
		ResultSet rs2 =  statement.executeQuery(sql2);
		while(rs2.next()){
			score.add(rs2.getString(1));
		}
		
		ResultSet rs1 =  statement.executeQuery(sql1);
		while(rs1.next()){
			score.add(rs1.getString(1));
		}
		//[{value:duan1, name:'40-50'},{value:$2, name:'50-60'}]
		String seris = "[{value:"+score.get(0)+", name:'40-50'},{value:"+score.get(1)+", name:'50-60'},{value:"+score.get(2)+", name:'60-70'},{value:"+score.get(3)+", name:'70-80'},{value:"+score.get(4)+", name:'80-90'},{value:"+score.get(5)+", name:'90-100'}]";
	
		String option = "option = {title : {text: '各分数段所占比例',x:'center'},tooltip : {trigger: 'item',formatter: \"{a} <br/>{b} : {c} ({d}%)\"},legend: {orient: 'vertical',left: 'left',data: ['40-50','50-60','60-70','70-80','80-90','90-100']},series : [{name: '所占比例',type: 'pie',radius : '55%',center: ['50%', '60%'],data:"+seris+",itemStyle: { emphasis: {shadowBlur: 10,shadowOffsetX: 0,shadowColor: 'rgba(0, 0, 0, 0.5)'}}}]}";
		
	
		System.out.println("option:"+option);
		String results = option;
		response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(results);
	}
}
