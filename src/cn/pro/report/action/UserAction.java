package cn.pro.report.action;

import cn.pro.report.server.IUserServer;
import cn.pro.report.server.UserServer;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3085034958982891325L;
	
	private IUserServer userServer;
	
	
	public String listUsers()
	{
/*		System.out.println(userDao==null);
		
		System.out.println(userDao.selectUserByID("010").getName());*/
		System.out.println(userServer.listUsers().size());
		System.out.println(userServer instanceof UserServer);
		return "success";
	}
	
	public String initUsers()
	{
		

		userServer.initUser("G:\\excel\\工作簿消费明细完整20160614.xls");
		return "success";
	}
	
	
/*	spring aop 采用的是动态代理（jdk动态代理或cglib动态代理），在运行时生成代理类实现切入的逻辑，
	由于static方法和final方法不能被重写，在static和final方法上应用横切关注点也是无法做到的*/
	public String insertUser()
	{
		userServer.insertUser();
		
		
		System.out.println(userServer.getClass());
		return "success";
	}

	public IUserServer getUserServer() {
		return userServer;
	}

	public void setUserServer(IUserServer userServer) {
		this.userServer = userServer;
	}



}
