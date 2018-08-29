package com.zsx.auty.service;

import com.zsx.auty.entity.SysUserEntity;

/**
 * 
 * @author Administrator
 *
 */
public interface SysUserService {

	SysUserEntity getByUserName(String username);
	
	int saveUser(SysUserEntity user);
}
