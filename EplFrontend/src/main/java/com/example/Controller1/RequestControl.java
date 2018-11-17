package com.example.Controller1;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestControl {

	@RequestMapping("/")
	public String index() {
        return "one";
	}
	
	@RequestMapping("/welcome")
	public String welcome() {
        return "hello";
	}
	
	  @GetMapping("/greeting")
	    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
	        model.addAttribute("name", name);
	        return "greeting";
	    }
	
	@RequestMapping("/hello")
	public String hello2()
	{
		return "hello2";
	}
}
