package cn.pro.report.action;

import cn.pro.report.server.IUserServer;
import cn.pro.report.entity.*;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3085034958982891325L;
	
	private IUserServer userServer;
	
	private List<User> users;
	
	
	public String listUsers()
	{
/*		System.out.println(userDao==null);
		
		System.out.println(userDao.selectUserByID("010").getName());*/
		setUsers(userServer.listUsers());
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

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}



}
