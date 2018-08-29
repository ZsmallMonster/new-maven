package com.zsx.auty.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
@MapperScan
public interface SysUserRoleMapper {

	List<Long> listUserRoleId(Long userId);
	
	int batchRemoveByUserId(Long[] id);
	
	int batchRemoveByRoleId(Long[] id);
	
}
