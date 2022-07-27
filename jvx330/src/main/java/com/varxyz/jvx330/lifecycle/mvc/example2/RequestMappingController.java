package com.varxyz.jvx330.lifecycle.mvc.example2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestMappingController {
	
	@RequestMapping(value="/example2/mapping", method = RequestMethod.GET)
	public String getMapping() {
		return "example2/mapping_result";
	}
	
	@RequestMapping(value="/example2/mapping", method = RequestMethod.POST)
	public ModelAndView postMapping() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("example2/mapping_result");
		mav.addObject("result","post 요청의 결과 메세지");
		
		return mav;
	}
}
