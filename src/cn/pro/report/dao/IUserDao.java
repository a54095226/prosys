package cn.pro.report.dao;

import java.util.List;

import cn.pro.report.entity.User;

public interface IUserDao {
	public List<User> selectUserbyName(String name);
	public int insertUser(User user);
	public List<User> selectAllUser();
	public User selectUserByID(String id);
	public int deleteUserByID(String id);
	public int deleteAllUser();


}
