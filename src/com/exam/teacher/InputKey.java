/**
 * 
 */
package com.exam.teacher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

import com.exam.util.JdbcUtil;


/**
 * @author michael
 * Description: 
 * 提取教师上传的答案，并上传到数据库中
 *
 *
 * 2017年4月15日
 */
public class InputKey {
	/*
	 * 从file文件中读出答案，并以list形式返回
	 * */
	public static ArrayList<String> getKey(File file){
		ArrayList<String> keyText = new ArrayList<>();
		try {
			InputStreamReader read = new InputStreamReader(new FileInputStream(file), "UTF-8");
			BufferedReader bufferedReader = new BufferedReader(read);
			String lineTxt = null;
			
			while ((lineTxt = bufferedReader.readLine()) != null) {
				System.out.println(lineTxt.trim());
				String line = lineTxt.trim();
				int at = line.indexOf(".");
				keyText.add(lineTxt.trim().substring(at + 1));

			}
			for (int i = 0; i < keyText.size(); i++) {
				System.out.println(keyText.get(i));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return keyText;
		
	}
	
	/*//获取分值
	public static ArrayList<String> getScore(File file){
		ArrayList<String> scoreText = new ArrayList<>();
		try {
			InputStreamReader read = new InputStreamReader(new FileInputStream(file), "UTF-8");
			BufferedReader bufferedReader = new BufferedReader(read);
			String lineTxt = null;
			
			while((lineTxt = bufferedReader.readLine())!=null){
				//如果有一行包含一二三，则说明这一行是题目类别,可以提取出分值
				if(lineTxt.contains("一")||lineTxt.contains("二")||lineTxt.contains("三")){
					String regEx = "[^0-9]";//匹配指定范围内的数字
					Pattern p = Pattern.compile(regEx);  //pattern是一个正则表达式经过编译后的表现形式
					Matcher m = p.matcher(lineTxt); //一个Matcher对象是一个状态机器，它依据Pattern对象做为匹配模式对字符串展开匹配检查。
					String string = m.replaceAll(" ").trim();//将输入的字符串中非数字部分用空格取代并存入一个字符串
					String score = string.split("")[0];
					System.out.println(score);
					scoreText.add(score);
				}
			}
			for (int i = 0; i < scoreText.size(); i++) {
				System.out.println(scoreText.get(i));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return scoreText;
	}*/
	
	/*
	 * 根据考试名称和考试时间创建表
	 * */
	public static void createTable(String name, String time) throws Exception{
		JdbcUtil jdbcUtil = new JdbcUtil();
		Connection con = jdbcUtil.getConnection();
		String sql = "create table "+name+time+"key"+"(keyID varchar(255), keyvalue varchar(255))CHARSET=utf8 ";
		Statement statement = con.createStatement();
		statement.execute(sql);
	}
	@Test
	public static void inputKey(String name , String time, ArrayList<String> key) throws Exception{
		String str = "";
		String sql = "insert into "+name+time+"key"+" VALUES";
		JdbcUtil jdbcUtil = new JdbcUtil();
		Connection con = jdbcUtil.getConnection();
		
		for (int i = 0; i < key.size(); i++) {
			str = str+"('"+(i+1)+"', "+"'"+key.get(i)+"'), ";
		}
		str = str.substring(0, str.length()-2);
		System.out.println("str"+str);
		sql = sql+str;
		System.out.println(sql);
		Statement statement = con.createStatement();
		statement.execute(sql);
	}
}

