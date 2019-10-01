package com.infyniteloop.book4me.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infyniteloop.book4me.model.Biodata;
import com.infyniteloop.book4me.service.BiodataService;


	
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private BiodataService biodataService;
	
	@RequestMapping("/login")
	public String homePage(Model model)
	{
		List<Biodata> bioList = biodataService.listAll();
		model.addAttribute("biodataList" , bioList);
		return "Login";
	}
	
	@RequestMapping(value = "/biodata/all", method = RequestMethod.GET, produces = "application/json")
	public List<Biodata> firstPage() {
		return biodataService.listAll();
	}
	
	
	

}
