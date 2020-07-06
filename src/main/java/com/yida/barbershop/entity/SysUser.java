package com.yida.barbershop.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;
import lombok.Data;

/**
*@author : zhuquanzhen
*@version :2020年7月6日下午4:49:59
*/
@Data
@Entity
@DynamicUpdate
public class SysUser implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 创建时间
	 */
	private String createTime;
}
