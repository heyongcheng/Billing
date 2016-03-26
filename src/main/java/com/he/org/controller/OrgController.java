package com.he.org.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.he.base.BaseController;
import com.he.org.service.OrgService;
@Controller
@RequestMapping("/org")
public class OrgController extends BaseController {
	
	@Resource
	OrgService orgService;
}
