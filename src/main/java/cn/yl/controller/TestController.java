package cn.yl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/test.do")
	public String testView(Model map) { 
		System.out.println("controller");
//		map.put("item", "introduction");
		map.addAttribute("item", "introduction");
		return "myView"; //这里的myView为layout.xml中配置的视图名称，根据返回值，去匹配对应的jsp页面
	}
}
