package vn.com.vti.springexam.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FortuneController {
	@RequestMapping("fortune")
	public String fortune(Model model) {
		Random random = new Random();
		int number = random.nextInt(3);
		String val = null;
		switch (number) {
			case 0:
				val="Lucky!";
				break;
			case 1:
				val="Normal!";
				break;
			case 2:
				val="Bad!";
				break;
			
		}
		model.addAttribute("val", val);
		return "fortune";
	}
}
