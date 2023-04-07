package vn.com.vti.springexam.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/currentTime")
public class CurrentTimeController {
	
	@RequestMapping(value="/index")
	public String index( Model model ) {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dateStr = dateFormat.format(date);

		model.addAttribute("dateAndTime", dateStr);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);

		model.addAttribute("listA", list);
		
		return "currentTimeView";
	}
	
	public String index1( ) {
		return "";
	}
}
