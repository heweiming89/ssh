package cn.heweiming.ssh.controller;

import java.util.Date;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.heweiming.ssh.model.Admin;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@RequestMapping(value = "mgmt", produces = { MediaType.APPLICATION_XHTML_XML_VALUE })
	@ResponseBody
	public Admin mgmt() {
		Admin admin = new Admin();
		admin.setId(10000);
		admin.setUsername("admin");
		admin.setPassword("123456");
		admin.setBirthday(new Date());
		return admin;
	}

	@RequestMapping(value = "mgmt2", produces = { MediaType.TEXT_HTML_VALUE })
	@ResponseBody
	public Admin mgmt2() {
		Admin admin = new Admin();
		admin.setId(10000);
		admin.setUsername("admin2");
		admin.setPassword("123456");
		admin.setBirthday(new Date());
		;
		return admin;
	}

}
