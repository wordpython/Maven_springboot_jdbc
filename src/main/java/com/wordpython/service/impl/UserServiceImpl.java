package com.wordpython.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.wordpython.po.Users;
import com.wordpython.service.UserService;


@Service
@Repository
public class UserServiceImpl implements UserService{

	@Autowired//自动注入
	private JdbcTemplate jdbcTemplate;
	public Users registerUser(String username,String password) {
		String sql="select * from users where username=?";
		RowMapper<Users> rowMapper = new BeanPropertyRowMapper<Users>(Users.class);
		Users user = jdbcTemplate.queryForObject(sql, rowMapper,username);
		System.out.println(user);
		return user;
	}
}
