package com.jeffersonbarbosa.giza.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeffersonbarbosa.giza.model.UserModel;

@Controller
public class LoginController {

	@RequestMapping("efetuaLogin")
	public String efetuaLogin(UserModel user, HttpSession session) {
		// if(new JdbcUsuarioDao().existeUsuario(user)) {
		// session.setAttribute("usuarioLogado", user);
		return "menu";
		// }
		// return "redirect:loginForm";
	}

	@RequestMapping("loginForm")
	public String loginForm() {
		return "formulario-login";
	}
}