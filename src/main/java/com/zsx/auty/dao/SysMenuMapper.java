package com.zsx.auty.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.zsx.auty.entity.SysMenuEntity;

/**
 * 系统菜单dao
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2017年8月10日 上午12:21:34
 */
@MapperScan
public interface SysMenuMapper {
	
	List<SysMenuEntity> listParentId(Long parentId);
	
	List<SysMenuEntity> listNotButton();
	
	List<String> listUserPerms(Long userId);

}
