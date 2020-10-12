<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@taglib prefix="s" uri="/struts-tags" %>    --%>
    <html lang="zh-CN">
     <body>
 <div class="container">
        <div class="main" style="padding:50px 15px ">
            <table class="table table-hover table-condensed">
              <thead>
                <tr>
                  <th>#</th>
                  <th>姓名1</th>
                  <th>编号</th>
                  <th>卡号</th>
                  <th>操作</th>
                </tr>
              </thead>
              <tbody>
              

          
<!--              <s:iterator value="users" id="column">
                <tr>
                  <td>1</td>
                  <td> <s:property value="name"/> </td>
                  <td><s:property value="id"/></td>
                  <td><s:property value="cid"/></td>
                  <td>
                  <button type="button" class="btn btn-warning btn-xs">修改</button>
                  <button type="button" class="btn btn-danger btn-xs">删除</button>
                  </td>
                </tr>
                 </s:iterator> -->
               
              </tbody>
            </table>
                 <div class="row">
  <div class="col-md-6 col-md-offset-3">
  <nav aria-label="Page navigation">
  <ul class="pagination">
   
  </ul>
</nav>
  </div>
</div>

     </div>

     

    </div>
 <!--    <s:debug></s:debug> -->
     <script src="js/jquery.min.js"></script> 
 <script type="text/javascript">
 $(document).ready(function(){
	 var page;
	 $.post("user/countUsers", 
			   function(data){
		  page =  Number(data);
		  alert(page);
			   });
	 

	 $('.pagination').jqPaginator({
		    totalPages: 32 ,
		    visiblePages: 5,
		    currentPage:1,
		   
		    first: '<li class="first"><a href="javascript:void(0);">首页</a></li>',
		    prev: '<li class="prev"><a href="javascript:void(0);">上一页</a></li>',
		    next: '<li class="next"><a href="javascript:void(0);">下一页</a></li>',
		    last: '<li class="last"><a href="javascript:void(0);">末页</a></li>',
		    page: '<li class="page"><a href="javascript:void(0);">{{page}}</a></li>',
		    onPageChange: function (num, type) {
		    	 
		    	

		    }
		});
	 });
 </script>
    
     <body>

    </html>