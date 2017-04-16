<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet" href="css/pintuer.css">
<link rel="stylesheet" href="css/admin.css">
<script src="js/jquery.js"></script>
<script src="js/pintuer.js"></script>
<script src="js/echarts.js"></script>
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong class="icon-reorder">答案解析</strong></div>
  <div class="padding border-bottom">  
  </div>
  <table class="table table-hover text-center">
    <tr>
      <th width="10%">题号</th>
      <th width="20%">答案</th>
      <th width="15%">分值</th>
      <th width="20%">题目描述</th>
      <th width="10%">难度</th>
      <th width="15%">操作</th>
    </tr>
   
    <tr>
      <td>1</td>     
      <td>B</td>     
      <td>5</td>
      <td>请选择正确的选项...</td>
      <td>5</td>
      <td><div class="button-group">
      <a class="button border-main" href="#add"><span class="icon-edit"></span>查看答案解析</a>
     
      </div></td>
    </tr>
    <tr>
      <td>2</td>     
      <td>B</td>     
      <td>5</td>
      <td>请选择正确的选项...</td>
      <td>5</td>
      <td><div class="button-group">
      <a class="button border-main" href="#add"><span class="icon-edit"></span>查看答案解析</a>
    
      </div></td>
    </tr>
    <tr>
      <td>3</td>     
      <td>B</td>     
      <td>5</td>
      <td>请选择正确的选项...</td>
      <td>5</td>
      <td><div class="button-group">
      <a class="button border-main" href="#add"><span class="icon-edit"></span>查看答案解析</a>

      </div></td>
    </tr>
       <tr>
      <td>4</td>     
      <td>B</td>     
      <td>5</td>
      <td>请选择正确的选项...</td>
      <td>5</td>
      <td><div class="button-group">
      <a class="button border-main" href="#add"><span class="icon-edit"></span>查看答案解析</a>

      </div></td>
    </tr>
       <tr>
      <td>5</td>     
      <td>B</td>     
      <td>5</td>
      <td>请选择正确的选项...</td>
      <td>5</td>
      <td><div class="button-group">
      <a class="button border-main" href="#add"><span class="icon-edit"></span>查看答案解析</a>

      </div></td>
    </tr>
       <tr>
      <td>6</td>     
      <td>B</td>     
      <td>5</td>
      <td>请选择正确的选项...</td>
      <td>5</td>
      <td><div class="button-group">
      <a class="button border-main" href="#add"><span class="icon-edit"></span>查看答案解析</a>

      </div></td>
    </tr>
       <tr>
      <td>7</td>     
      <td>B</td>     
      <td>5</td>
      <td>请选择正确的选项...</td>
      <td>5</td>
      <td><div class="button-group">
      <a class="button border-main" href="#add"><span class="icon-edit"></span>查看答案解析</a>

      </div></td>
    </tr>
    
  </table>
</div>
<script type="text/javascript">
function del(id,mid){
	if(confirm("您确定要删除吗?")){
	
	}
}
</script>
<div class="panel admin-panel margin-top" id="add">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span>自己的答案（红色表示错误）</strong></div>
  <div class="body-content">
  <table class="table table-hover text-center">
    <tr>
      <th width="10%">题号</th>
      <th width="20%">答案</th>
      <th width="15%">分值</th>
      <th width="20%">题目描述</th>
      <th width="10%">难度</th>
      <th width="15%">操作</th>
    </tr>
   
    <tr>
      <td>1</td>     
      <td>B</td>     
      <td>5</td>
      <td>请选择正确的选项...</td>
      <td>5</td>
      <td><div class="button-group">
      <a class="button border-main" href="#add"><span class="icon-edit"></span>查看答案解析</a>
     
      </div></td>
    </tr>
    <tr>
      <td>2</td>     
      <td>B</td>     
      <td>5</td>
      <td>请选择正确的选项...</td>
      <td>5</td>
      <td><div class="button-group">
      <a class="button border-main" href="#add"><span class="icon-edit"></span>查看答案解析</a>
    
      </div></td>
    </tr>
    <tr>
      <td>3</td>     
      <td style="color:red">C</td>     
      <td>5</td>
      <td>请选择正确的选项...</td>
      <td>5</td>
      <td><div class="button-group">
      <a class="button border-main" href="#add"><span class="icon-edit"></span>查看答案解析</a>

      </div></td>
    </tr>
       <tr>
      <td>4</td>     
      <td>B</td>     
      <td>5</td>
      <td>请选择正确的选项...</td>
      <td>5</td>
      <td><div class="button-group">
      <a class="button border-main" href="#add"><span class="icon-edit"></span>查看答案解析</a>

      </div></td>
    </tr>
       <tr>
      <td>5</td>     
      <td style="color:red">D</td>     
      <td>5</td>
      <td>请选择正确的选项...</td>
      <td>5</td>
      <td><div class="button-group">
      <a class="button border-main" href="#add"><span class="icon-edit"></span>查看答案解析</a>

      </div></td>
    </tr>
       <tr>
      <td>6</td>     
      <td>B</td>     
      <td>5</td>
      <td>请选择正确的选项...</td>
      <td>5</td>
      <td><div class="button-group">
      <a class="button border-main" href="#add"><span class="icon-edit"></span>查看答案解析</a>

      </div></td>
    </tr>
       <tr>
      <td>7</td>     
      <td>B</td>     
      <td>5</td>
      <td>请选择正确的选项...</td>
      <td>5</td>
      <td><div class="button-group">
      <a class="button border-main" href="#add"><span class="icon-edit"></span>查看答案解析</a>

      </div></td>
    </tr>
    
  </table>
  </div>
</div>
</body></html>