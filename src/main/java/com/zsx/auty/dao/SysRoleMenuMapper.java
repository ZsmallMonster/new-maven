package com.zsx.auty.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
@MapperScan
public interface SysRoleMenuMapper {

	int batchRemoveByMenuId(Long[] id);
	
	int batchRemoveByRoleId(Long[] id);
	
	List<Long> listMenuId(Long id);
	
}
