package com.dzjin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.dzjin.model.UnitCode;

public interface UnitCodeMapper {
	
	@Select("select * from unitCode")
	public List<UnitCode> queryUnitCodeList();

}
