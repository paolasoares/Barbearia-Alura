package com.ecommerce.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("")
	public String verTelaInicial() {
		return "index";
	}

}
