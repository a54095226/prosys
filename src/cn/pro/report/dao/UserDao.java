package cn.pro.report.dao;







import java.util.List;


import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import cn.pro.report.entity.User;

public class UserDao implements IUserDao {
	
	private JdbcTemplate jdbcTemplate;

	
	
    /*	jdbcTemplate 封装了jdbc相关事务处理，执行sql、orm映射等操作，使得开发更加方便
	程序不需要 
	获取数据库连接 con = dataSource.getConnection(); 
	关闭数据库连接con.close();
	由JdbcTemplate 
	jdbcTemplate 使用DataSourceUtils.getConnection 获取当前线程的连接 
	保证线程中的数据库连接都是一个事务连接
    */

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}





	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}





	@Override
	public List<User> selectUserbyName(String name)
	{
		String sql ="select * from custable where name=?";
		
		//自动映射 BeanPropertyRowMapper 会帮程序将结果集映射按属性-字段名称映射成对象
		List<User> list = jdbcTemplate.query(sql,new Object[]{name},new BeanPropertyRowMapper<User>(User.class));

		return list;
	}
	
	@Override
	public User selectUserByID(String id)
	{
		String sql ="select * from custable where id=?";
		//自动映射 BeanPropertyRowMapper 会帮程序将结果集映射按属性-字段名称映射成对象
		User user = jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<User>(User.class));
		
		return user;
	}




	@Override
	public int insertUser(User user)
	{

        String sql = "insert into custable values(?,?,?)";
       /* TransactionSynchronizationManager.setCurrentTransactionIsolationLevel(1);*/
       /* System.out.println(TransactionSynchronizationManager.isSynchronizationActive());*/
        int i = jdbcTemplate.update(sql, new Object[]{user.getId(),user.getCid(),user.getName()});


        return i;


		
	}





	@Override
	public List<User> selectAllUser(int page) {
		// TODO Auto-generated method stub
         String sql ="select * from custable where rowid between ? and ?";
		
		//自动映射 BeanPropertyRowMapper 会帮程序将结果集映射按属性-字段名称映射成对象
		List<User> list = jdbcTemplate.query(sql,new Object[]{(page-1)*10+1,page*10},new BeanPropertyRowMapper<User>(User.class));

		return list;
	}
	
	@Override
	public int deleteUserByID(String id)
	{
		String sql="delete from custable where id=?";
		return jdbcTemplate.update(sql, new Object[]{id});	
	}
	@Override
	public int deleteAllUser()
	{
		String sql="delete from custable";
		return jdbcTemplate.update(sql);	
	}
	@Override
	public int countUsers()
	{
		String sql="select count(*) from custable";
		return jdbcTemplate.queryForInt(sql);
	}







}
