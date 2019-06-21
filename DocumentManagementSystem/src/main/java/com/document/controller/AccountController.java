package com.document.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.document.dao.Document;
import com.document.entity.Account;

@Controller
public class AccountController {
	@Autowired
	Document doc;
	@RequestMapping(value="/index.htm")
	public String welcome(Model model){
		model.addAttribute("account",doc.getAccount());
		return "account";
	}
	@RequestMapping(value="/postInfo.htm",method=RequestMethod.POST)
	public String Data(Model model,@ModelAttribute(value="account")Account account){
		doc.saveAccount(account);
		model.addAttribute("accountList", doc.getAccount());
		return "accountinfo";
	}
	

}
