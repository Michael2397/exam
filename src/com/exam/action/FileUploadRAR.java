/**
 * 
 */
package com.exam.action;

import java.io.File;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.exam.teacher.InputKey;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author michael
 * Description: 
 *
 *
 * 2017年4月15日
 */
public class FileUploadRAR extends ActionSupport {
	//对应于表单
	private File file;
	//文件名
	private String fileFileName;
	//文件类型
	private String fileContentType;
    //考试名称
	private String examName;
	//考试时间
	private String examTime;
	//考试说明
	private String examDescription;
	

	public File getFile() {
		return file;
	}


	public void setFile(File file) {
		this.file = file;
	}


	public String getFileFileName() {
		return fileFileName;
	}


	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}


	public String getFileContentType() {
		return fileContentType;
	}


	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}


	public String getExamName() {
		return examName;
	}


	public void setExamName(String examName) {
		this.examName = examName;
	}


	public String getExamTime() {
		return examTime;
	}


	public void setExamTime(String examTime) {
		this.examTime = examTime;
	}


	public String execute() throws Exception{
		String path = ServletActionContext.getServletContext().getRealPath("/upload");
		System.out.println("path输出路径："+path);
		System.out.println("文件名"+fileFileName);
		System.out.println("文件类型"+fileContentType);
		//创建文件对象
		File destFile = new File(path,fileFileName);
		//把上传的文件，拷贝到目标文件中
		FileUtils.copyFile(file, destFile);

		
		return SUCCESS;
	}
}
