package com.zsx.auty.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsx.auty.dao.SysUserMapper;
import com.zsx.auty.entity.SysUserEntity;
import com.zsx.auty.service.SysUserService;
/**
 * 
 * @version
 * 
 * @author Administrator
 *
 */
@Service
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserMapper sysUserMapper;
	@Override
	public SysUserEntity getByUserName(String username) {
		
		return sysUserMapper.getByUserName(username);
	
	}
	@Override
	public int saveUser(SysUserEntity user) {

		//user.getUsername();
		//user.getPassword();
		return sysUserMapper.saveUser(user);
	}

}
