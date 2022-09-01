package com.gomycode.Devops.Controlleurs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/welcome","/hom*"})
public class welcomeControlleur {
	

	@GetMapping("{name}")
	
	public String welcome(@PathVariable("name") String name)
	{
		return ("welcome ash"+"  "+name);
	}

}
