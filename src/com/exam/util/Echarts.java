/**
 * 
 */
package com.exam.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * @author michael
 * Description: 
 *
 *
 * 2017年4月16日
 */
public class Echarts {
	public static void line() throws Exception{
		File file = new File("/exam/src/com/exam/util/line.txt");
		InputStreamReader read = new InputStreamReader(new FileInputStream(file), "UTF-8");
		BufferedReader bufferedReader = new BufferedReader(read);
		String lineTxt = null;
		String str = "";
		
		while ((lineTxt = bufferedReader.readLine()) != null) {
			str = str+lineTxt.trim();
		}
		System.out.println(str);
	}
}
