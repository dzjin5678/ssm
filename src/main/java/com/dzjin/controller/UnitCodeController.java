package com.dzjin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dzjin.model.UnitCode;
import com.dzjin.service.UnitCodeService;

@Controller
@RequestMapping(value = "/unitCode")
public class UnitCodeController {
	
	@Autowired
	UnitCodeService unitCodeService;
	
	@RequestMapping(value = "/queryUnitCodeList" , method = RequestMethod.GET)
	@ResponseBody
	public List<UnitCode> queryUnitCodeList(){
		return unitCodeService.queryUnitCodeList();
	}
}
