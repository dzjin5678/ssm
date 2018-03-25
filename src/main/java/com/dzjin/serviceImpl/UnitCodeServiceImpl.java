package com.dzjin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dzjin.mapper.UnitCodeMapper;
import com.dzjin.model.UnitCode;
import com.dzjin.service.UnitCodeService;

@Service
public class UnitCodeServiceImpl implements UnitCodeService {
	
	@Autowired
	UnitCodeMapper unitCodeMapper;

	@Override
	public List<UnitCode> queryUnitCodeList() {
		return unitCodeMapper.queryUnitCodeList();
	}

}
