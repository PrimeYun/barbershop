package com.yida.barbershop.UserTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yida.barbershop.entity.SysUser;
import com.yida.barbershop.repository.SysUserRepository;
import com.yida.barbershop.utils.JsonUtil;
import com.yida.barbershop.utils.KeyUtil;

import lombok.extern.slf4j.Slf4j;

/**
*@author : zhuquanzhen
*@version :2020年7月6日下午5:05:30
*/
@SpringBootTest
@Slf4j
public class TestUser {
	@Autowired
	private SysUserRepository sysUserRepository;
	
	@Test
	public void testAdd() {
		log.info("【新增数据】");
		SysUser user = new SysUser();
		user.setId(KeyUtil.getUniqueHey());
		user.setUsername("张狗");
		user.setPassword("*****");
		user.setCreateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		sysUserRepository.save(user);
		
	}
	@Test
	public void testSelect() {
		log.info("【查询数据】");
		List<SysUser> list = sysUserRepository.findAll();
		log.info("【查询数据，结果】{}",JsonUtil.toJson(list));
		
	}
}
