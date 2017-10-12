<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib prefix="s" uri="/struts-tags" %>   
    <%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  

%>

<html lang="zh-CN">
<head>
<base href="<%=basePath %>" />
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>main</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
</head>


 <body>
 
 <s:debug></s:debug>
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <a class="navbar-brand" href="#">报表生成系统</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
          <li><a>报表生成</a></li>
            <li><a>人员管理</a></li>
            
          </ul>
        </div>
      </div>
    </nav>
     <jsp:include page="emp.jsp" flush="true"/>       
 <script src="js/jquery.min.js"></script> 
<script src="js/bootstrap.min.js" ></script>
<script src="js/jqPaginator.js" ></script>



</body>
</html>