package vn.com.vti.springexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.vti.springexam.entity.JobType;
import vn.com.vti.springexam.entity.JobTypeExample;
import vn.com.vti.springexam.mapper.JobTypeMapper;


@Controller
@RequestMapping("jobType")
public class JobTypeController {
	@Autowired
	private JobTypeMapper jobTypeMapper;
	@RequestMapping("list")
	public String jobTypeList(Model model) {
		JobTypeExample jobTypeExample = new JobTypeExample();
		List<JobType> jobTypeList = jobTypeMapper.selectByExample(jobTypeExample);

		model.addAttribute("jobTypeList", jobTypeList);

		return "jobType/list";
	}
}
