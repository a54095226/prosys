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
              
	               <s:property value="name"/> 
	               <s:property value="department"/>
          
             <s:iterator value="users">
                <tr>
                  <td>1,001</td>
                  <td> <s:property value="id"/> </td>
                  <td><s:property value="cid"/></td>
                  <td><s:property value="name"/></td>
                  <td>
                  <button type="button" class="btn btn-warning btn-xs">修改</button>
                  <button type="button" class="btn btn-danger btn-xs">删除</button>
                  </td>
                </tr>
                 </s:iterator>
                <tr>
                  <td>1,002</td>
                  <td>amet</td>
                  <td>consectetur</td>
                  <td>adipiscing</td>
                  
                  <td>
                   <button type="button" class="btn btn-warning btn-xs">修改</button>
                   <button type="button" class="btn btn-danger btn-xs">删除</button></td>
                </tr>
                <tr>
                  <td>1,003</td>
                  <td>Integer</td>
                  <td>nec</td>
                  <td>odio</td>
                  
                 <td>
                  <button type="button" class="btn btn-warning btn-xs">修改</button>
                  <button type="button" class="btn btn-danger btn-xs">删除</button></td>
                </tr>
                <tr>
                  <td>1,003</td>
                  <td>libero</td>
                  <td>Sed</td>
                  <td>cursus</td>
                  <td>
                   <button type="button" class="btn btn-warning btn-xs">修改</button>
                   <button type="button" class="btn btn-danger btn-xs" >删除</button></td>
                </tr>
                <tr>
                  <td>1,004</td>
                  <td>dapibus</td>
                  <td>diam</td>
                  <td>Sed</td>
                 <td>
                  <button type="button" class="btn btn-warning btn-xs">修改</button>
                  <button type="button" class="btn btn-danger btn-xs">删除</button></td>
                </tr>
                <tr>
                  <td>1,005</td>
                  <td>Nulla</td>
                  <td>quis</td>
                  <td>sem</td>
                  <td>
                   <button type="button" class="btn btn-warning btn-xs">修改</button>
                   <button type="button" class="btn btn-danger btn-xs">删除</button></td>
                </tr>
                <tr>
                  <td>1,006</td>
                  <td>nibh</td>
                  <td>elementum</td>
                  <td>imperdiet</td>
                  <td>
                   <button type="button" class="btn btn-warning btn-xs">修改</button>
                   <button type="button" class="btn btn-danger btn-xs">删除</button></td>
                </tr>
                <tr>
                  <td>1,007</td>
                  <td>sagittis</td>
                  <td>ipsum</td>
                  <td>Praesent</td>
                  <td>
                   <button type="button" class="btn btn-warning btn-xs">修改</button>
                   <button type="button" class="btn btn-danger btn-xs">删除</button></td>
                </tr>
                <tr>
                  <td>1,008</td>
                  <td>Fusce</td>
                  <td>nec</td>
                  <td>tellus</td>
                  <td>
                   <button type="button" class="btn btn-warning btn-xs">修改</button>
                   <button type="button" class="btn btn-danger btn-xs">删除</button></td>
                </tr>
                <tr>
                  <td>1,009</td>
                  <td>augue</td>
                  <td>semper</td>
                  <td>porta</td>
                  <td>
                   <button type="button" class="btn btn-warning btn-xs">修改</button>
                   <button type="button" class="btn btn-danger btn-xs">删除</button></td>
                </tr>
                <tr>
                  <td>1,010</td>
                  <td>massa</td>
                  <td>Vestibulum</td>
                  <td>lacinia</td>
                  <td>
                   <button type="button" class="btn btn-warning btn-xs">修改</button>
                   <button type="button" class="btn btn-danger btn-xs">删除</button></td>
                </tr>
              </tbody>
            </table>

     </div>
    </div>
     <body>
    </html>