package cn.pro.report.server;

import java.util.List;



import cn.pro.report.entity.User;

public interface IUserServer {
	
	
	public int initUser(String filepath);
	
	public List<User> listUsers();
	
	/*  动态织入事务处理，propagation 设置事务的传播行为
	 * 
	  REQUIRED：支持当前事务，如果当前没有事务，就新建一个事务。这是最常见的选择。 

       SUPPORTS：支持当前事务，如果当前没有事务，就以非事务方式执行。 

       MANDATORY：支持当前事务，如果当前没有事务，就抛出异常。 

       REQUIRES_NEW：新建事务，如果当前存在事务，把当前事务挂起。 

       NOT_SUPPORTED：以非事务方式执行操作，如果当前存在事务，就把当前事务挂起。 

       NEVER：以非事务方式执行，如果当前存在事务，则抛出异常。 

       NESTED：支持当前事务，如果当前事务存在，则执行一个嵌套事务，如果当前没有事务，就新建一个事务。 */
	

	public void insertUser();

}
