package com.zsx.auty.dao;

import java.util.List;

import javax.management.Query;

import org.mybatis.spring.annotation.MapperScan;

import com.zsx.auty.entity.SysUserEntity;


/**
 * 系统用户dao
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2017年8月8日 下午3:26:05
 */
@MapperScan
public interface SysUserMapper {

	SysUserEntity getByUserName(String username);
	
	List<Long> listAllMenuId(Long userId);
	
	int updatePswdByUser(Query query);
	
	int updateUserStatus(Query query);
	
	int updatePswd(SysUserEntity user);
	
	int saveUser(SysUserEntity user);
	
}
