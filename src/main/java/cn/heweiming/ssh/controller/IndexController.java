package cn.heweiming.ssh.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@RequestMapping(value="/",produces={MediaType.APPLICATION_JSON_UTF8_VALUE})
	@ResponseBody
	public String index() {
		return "欢迎访问";
	}

}
