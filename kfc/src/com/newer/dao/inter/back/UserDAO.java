package com.newer.dao.inter.back;

import java.util.List;

import com.newer.pojo.User;

public interface UserDAO {
	
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public boolean add(User user);
	
	/**
	 * 删除用户
	 * @param user
	 * @return
	 */
	public boolean delete(User user);
	
	/**
	 * 根据角色id删除用户
	 * @param user
	 * @return
	 */
	public boolean deleteByRole_id(int role_id);

	/**
	 * 修改用户
	 * @param user
	 * @return
	 */
	public boolean modify(User user);

	/**
	 * 根据ID查询管理员用户
	 * @param user
	 * @return User
	 */
	public User selectById(int id);
	
	/**
	 * 根据用户名查询管理员用户
	 * @param user
	 * @return User
	 */
	public User selectByName(User user);


	/**
	 * 查询所有管理员用户
	 * @return List<User>
	 */
	public List<User> selectAll();
	
	/**
	 * 根据角色id查询所属管理员用户
	 * @return List<User>
	 */
	public List<User> selectAllByRoleId(int role_id);
	/**
	 * 根据管理员名字查询管理员用户，两个变量 1.角色id 2.用户名
	 * @param user
	 * @return User
	 */
	public  User selectByAdUserName(int role_id,String user_name);
}
