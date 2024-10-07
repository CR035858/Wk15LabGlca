package com.gl.labwk15d04dem01.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.labwk15d04dem01.model.CCRepDetails;
import com.gl.labwk15d04dem01.service.CCRepDetailService;



@Controller
@RequestMapping("/cgrievance")
public class CustomerGrievanceController {
	
	@Autowired
	CCRepDetailService ccRepService;
	
	@GetMapping("/list")
	public String getBooks(Model model) {
		List <CCRepDetails> ccRepDetails = ccRepService.getAllCCRepDetails();
		model.addAttribute("ccRepDetails", ccRepDetails);  //"books"->attribute name in the html file
		return "/list-ccreps"; //page to access
	}
	
	@GetMapping("/showFormForAdd")
	public String showAddForm(Model model) {
		CCRepDetails ccRep = new CCRepDetails();
		model.addAttribute("ccRep", ccRep);
		return "/ccrep-form";
	}
	
	@PostMapping("/showFormForUpdate")
	public String showUpdateForm(Model model,@RequestParam("repId") int repId) {
		CCRepDetails ccRep= ccRepService.getCCRepById(repId);
		model.addAttribute("ccRep", ccRep);
		return "/ccrep-form";
	}
	
	@PostMapping("/delete")
	public String delete(@RequestParam("repId") int repId) {
		ccRepService.deleteCCRepById(repId);
		return "redirect:/cgrievance/list";
	}
	
	@PostMapping("/save")
	
	public String save(@ModelAttribute("ccRep") CCRepDetails ccRep) {
		ccRepService.saveCCRepDetail(ccRep);
		return "redirect:/cgrievance/list";
	}
	
}
