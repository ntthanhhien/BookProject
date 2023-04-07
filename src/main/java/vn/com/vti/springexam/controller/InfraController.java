package vn.com.vti.springexam.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.vti.springexam.form.InfraForm;
import vn.com.vti.springexam.mapper.InfrastructureMapper;

@Controller
@RequestMapping("infrastructure")
public class InfraController {
	@ModelAttribute
	public InfraForm createForm() {
		return new InfraForm();
	}
	
	@Autowired
	private InfrastructureMapper infrastructureMapper;
	
	@RequestMapping("input")
	public String input(InfraForm infraForm) {
		return "infrastructure/input";
	}
	
	@RequestMapping("inputConfirm")
	public String inputConfirm(@Valid InfraForm prefectureForm,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()){
	  return input(prefectureForm);
		}
		return "infrastructure/inputConfirm";
	}
}
