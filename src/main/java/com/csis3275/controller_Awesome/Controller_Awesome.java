package com.csis3275.controller_Awesome;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.csis3275.model_Awesome.TeamMember_awesome;

@Controller
public class Controller_Awesome {

	private TeamMember_awesome wva_06_object = new TeamMember_awesome();
	private TeamMember_awesome ech_72_object = new TeamMember_awesome();

	public Controller_Awesome() {

		wva_06_object.setLinkedinUrl("https://www.linkedin.com/in/washington-eduardo-valencia-1ab8aa189/");
		wva_06_object.setGithubUrl("https://github.com/educristo777");
		wva_06_object.setAge(38);
		wva_06_object.setRoleName("Dev/Ops");
		wva_06_object.setName("Washington Valencia");
		wva_06_object.setImage("assets/images/images/wva-06.jpg");
		wva_06_object.setBio(
				"Entrepreneur, passionate, enthusiastic with high knowledge of IT and good leadership skills. In continuous professional training. Always adaptable and with all the desire to grow and learn.");
		InstantiateEdiObject();
	}

	private void InstantiateEdiObject() // move Edison instantiation down for better code readability
	{
		ech_72_object.setLinkedinUrl("https://www.linkedin.com/in/wai-cheung-chan-441687b0");
		ech_72_object.setGithubUrl("https://github.com/WCEdison");
		ech_72_object.setAge(28);
		ech_72_object.setRoleName("Lead/Dev/Ops");
		ech_72_object.setName("Edison CHAN");
		ech_72_object.setImage("assets/images/images/ech-72.jpg");
		ech_72_object.setBio(
				"A energetic and socialable programmer and entrepreneur. Co-founder and former chief engineer of Ed-Tech Startup Dot Dot Fire Limited. Welcome challenges or failings as long as he can fail forward.");

	}

	@GetMapping("/")
	public String renderHome(Model model) {

		model.addAttribute("wvaobj", wva_06_object);
		model.addAttribute("echobj", ech_72_object);
		return "home";
	}

	@GetMapping("/wva-06")
	public String renderProfilePage(Model model) {

		model.addAttribute("wvaobj", wva_06_object);

		return "wva-06";
	}

	@GetMapping("/ech-72")
	public String renderEdiProfilePage(Model model) {

		model.addAttribute("echobj", ech_72_object);

		return "ech-72";
	}
}
