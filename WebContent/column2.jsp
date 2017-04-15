<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>网站信息</title>  
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/admin.css">
    <script src="js/jquery.js"></script>
    <script src="js/pintuer.js"></script>  
</head>
<body>

<div class="panel admin-panel margin-top">
  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>上传答案</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="">   
      <input type="hidden" name="id"  value="" />  
      <div class="form-group">
        <div class="label">
          <label>考试名称：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="title" value="" data-validate="required:请输入考试名称" />         
          <div class="tips"></div>
        </div>
      </div> 
      
       <div class="form-group">
        <div class="label">
          <label>考试时间：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="entitle" value="" data-validate="required:请输入考试时间"/>         
          <div class="tips"></div>
        </div>
      </div>  
	  <div class="form-group">
        <div class="label">
          <label>上传考生答题：</label>
        </div>
        <div class="field">
          <input type="text" id="url1" name="banner" class="input tips" style="width:25%; float:left;"  value=""  />
          <input type="button" class="button bg-blue margin-left" id="image1" value="+ 浏览上传"  style="float:left;">
       </div>

      </div>	  

      <div class="form-group">
        <div class="label">
          <label>情况说明：</label>
        </div>
        <div class="field">
          <textarea type="text" class="input" name="s_desc" style="height:100px;" ></textarea>        
        </div>
     </div>
    
    
     <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
        </div>
      </div>
    </form>
  </div>
</div>
</body></html>