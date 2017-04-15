<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>答案一览表</title>
<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
<script src="./js/Table.js"></script>
<link rel="stylesheet" href="./css/pintuer.css">
<link rel="stylesheet" href="./css/admin.css">
<script src="./js/jquery.js"></script>
<script src="./js/pintuer.js"></script>
<style>
	table{ border: 1px solid #555555; margin: 1px; border-collapse: collapse; } 
	table td,table th{border: 1px solid #555555;}
	textarea{ width: 800px; height: 300px; padding: 20px; outline:none}
</style>
</head>

<body>
	<input type="text" placeholder="请输入搜索关键字" name="keywords" id="search" class="input" style="width:250px; line-height:17px;display:inline-block" />
 	<a href="javascript:void(0)" class="button border-main icon-search"  onclick="getSearch()" > 搜索</a></li>
<div id="table"></div>
<script type="text/javascript">
function getSearch(){
    var content = document.getElementById('search').value;
    $.ajax({
		type:"post",
		data:{content:content},
		url:"common!requestKey.action",
		dataType:"text",
		success:function(results){
           alert(results);
           option1=eval("("+results+")"); 
           Table().init(option1);
		  
		},
		error:function(){
			alert("出错了");
		}
	});

}
</script>



</body>
</html>
