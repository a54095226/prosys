<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>   
    <html lang="zh-CN">
     <body>
 <div class="container">
        <div class="main" style="padding:60px 15px">
            <table class="table table-hover table-condensed">
              <thead>
                <tr>
                  <th>#</th>
                  <th>姓名</th>
                  <th>编号</th>
                  <th>卡号</th>
                  <th>操作</th>
                </tr>
              </thead>
              <tbody>
              

          
             <s:iterator value="users" id="column">
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
                 </s:iterator>
               
              </tbody>
            </table>

     </div>
    </div>
     <body>
    </html>