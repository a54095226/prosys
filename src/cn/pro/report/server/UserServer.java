package cn.pro.report.server;


import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



import cn.pro.report.dao.IUserDao;
import cn.pro.report.entity.User;
import cn.pro.report.excel.ExcelOperation;


public class UserServer implements IUserServer {
	private IUserDao userDao;
	/*编程式事务管理
	
	注入事务处理*/
/*	private DataSourceTransactionManager transactionManager;  */

	
	/*注解的方式切入事务*/
	/*由excel文件初始化用户*/
	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public int initUser(String filepath) {
		
		/*先删除所有数据*/

	    int size = 0;
	   
		userDao.deleteAllUser();
		/*从文件获取user表*/
		List<User> users = ExcelOperation.getuser(filepath);
		
		if(users!=null)
		  {
		    size = users.size();
		    for(User user:users)
		    {
			  userDao.insertUser(user);
		     }


		   }
		
		return size;
	}
	
	public List<User> listUsers()
	{
		return userDao.selectAllUser();
	}
	
	
    /*声明式事务管理*/
	public  void insertUser()
	{
		
/*	
 * 编程式事务管理	
 *      TransactionDefinition def = new DefaultTransactionDefinition();
		
	    TransactionStatus status = transactionManager.getTransaction(def);
	    System.out.println(TransactionSynchronizationManager.isSynchronizationActive());
	    
		try{
			userDao.insertUser(new User("002","002","bbb"));
			userDao.insertUser(new User("003","003","ccc"));
			transactionManager.commit(status);
		}catch(DataAccessException e)
		{
			e.printStackTrace();
			transactionManager.rollback(status);
		}*/
		userDao.insertUser(new User("002","002","bbb"));


	}

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

/*	public DataSourceTransactionManager getTransactionManager() {
		return transactionManager;
	}

	public void setTransactionManager(DataSourceTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}*/



}
