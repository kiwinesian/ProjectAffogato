package com.ProjectAffogato.www.signin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SigninController {

	@RequestMapping(value = "signin")
	public String signin() {
		System.out.println("Signin Controller method signin");
        return "signin/signin";
    }
}

