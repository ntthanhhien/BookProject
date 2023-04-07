package vn.com.vti.springexam.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.com.vti.springexam.entity.Infrastructure;
import vn.com.vti.springexam.entity.InfrastructureExample;
import vn.com.vti.springexam.entity.OrderHeader;
import vn.com.vti.springexam.entity.OrderHeaderExample;
import vn.com.vti.springexam.entity.Prefecture;
import vn.com.vti.springexam.entity.PrefectureExample;
import vn.com.vti.springexam.entity.Section3;
import vn.com.vti.springexam.entity.Section3Example;
import vn.com.vti.springexam.entity.Section8;
import vn.com.vti.springexam.entity.Section8Example;
import vn.com.vti.springexam.form.PrefectureForm;
import vn.com.vti.springexam.mapper.InfrastructureMapper;
import vn.com.vti.springexam.mapper.OrderHeaderMapper;
import vn.com.vti.springexam.mapper.PrefectureMapper;
import vn.com.vti.springexam.mapper.Section3Mapper;
import vn.com.vti.springexam.mapper.Section8Mapper;

@Controller
@RequestMapping("prefecture")
public class PrefectureController {
	@ModelAttribute
	public PrefectureForm createForm() {
		return new PrefectureForm();
	}

	@Autowired
	private PrefectureMapper prefectureMapper;

	@Autowired
	private OrderHeaderMapper orderHeaderMapper;

	@RequestMapping("list")
	public String list(Model model) {
		PrefectureExample example = new PrefectureExample();
		example.setOrderByClause("ID");
		List<Prefecture> preList = prefectureMapper.selectByExample(example);
		model.addAttribute("preList", preList);

		//demo formatDate
		OrderHeaderExample oeExample = new OrderHeaderExample();
		List<OrderHeader> orderHeader = orderHeaderMapper.selectByExample(oeExample);
		model.addAttribute("orderHeader", orderHeader);

		return "prefecture/list";
	}

	@RequestMapping("input")
	public String input(PrefectureForm prefectureForm) {
		return "prefecture/input";
	}

	@RequestMapping("inputConfirm")
	public String inputConfirm(@Valid PrefectureForm prefectureForm,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return input(prefectureForm);
		}
		return "prefecture/inputConfirm";
	}

	@Autowired
	private Section3Mapper section3Mapper;
	@Autowired
	private Section8Mapper section8Mapper;
	@Autowired
	private InfrastructureMapper infrastructureMapper;

	@RequestMapping("update")
	public String update(@RequestParam Integer id, PrefectureForm prefectureForm, Model model) {
		Prefecture prefecture = prefectureMapper.selectByPrimaryKey(id);
		prefectureForm.setId(prefecture.getId());
		prefectureForm.setName(prefecture.getName());
		prefectureForm.setPopulation(prefecture.getPopulation());
		prefectureForm.setSection3Id(prefecture.getSection3Id());
		prefectureForm.setSection8Id(prefecture.getSection8Id());

		Section3Example section3Example = new Section3Example();
		section3Example.setOrderByClause("id");
		List<Section3> section3List = section3Mapper.selectByExample(section3Example);
		model.addAttribute("section3List", section3List);

		Section8Example section8Example = new Section8Example();
		section8Example.setOrderByClause("id");
		List<Section8> section8List = section8Mapper.selectByExample(section8Example);
		model.addAttribute("section8List", section8List);

		InfrastructureExample infrastructureExample = new InfrastructureExample();
		infrastructureExample.setOrderByClause("id");
		List<Infrastructure> infrastructureList = infrastructureMapper.selectByExample(infrastructureExample);
		model.addAttribute("infrastructureList", infrastructureList);
		return "prefecture/update";
	}

	@RequestMapping("updateConfirm")
	public String updateConfirm(PrefectureForm prefectureForm, Model model) {
		if (prefectureForm.getSection3Id() != null) {
			Section3 section3 = section3Mapper.selectByPrimaryKey(prefectureForm.getSection3Id());
			model.addAttribute("section3", section3);
		}
		List<Infrastructure> infrastructureList = new ArrayList<Infrastructure>();
		for (Integer infraId : prefectureForm.getInfrastructureList()) {
			Infrastructure infrastructure = infrastructureMapper.selectByPrimaryKey(infraId);
			infrastructureList.add(infrastructure);
		}
		model.addAttribute("infrastructureList", infrastructureList);
		if (prefectureForm.getSection8Id() != null) {
			Section8 section8 = section8Mapper.selectByPrimaryKey(prefectureForm.getSection8Id());
			model.addAttribute("section8", section8);
		}
		return "prefecture/updateConfirm";
	}

	@RequestMapping("updateExecute")
	public String updateExecute(PrefectureForm prefectureForm, Model model) {
		Prefecture prefecture = new Prefecture();
		prefecture.setId(prefectureForm.getId());
		prefecture.setName(prefectureForm.getName());
		prefecture.setPopulation(prefectureForm.getPopulation());
		prefecture.setSection3Id(prefectureForm.getSection3Id());
		prefecture.setSection8Id(prefectureForm.getSection8Id());

		prefectureMapper.updateByPrimaryKey(prefecture);

		return "redirect:./list";
	}
}