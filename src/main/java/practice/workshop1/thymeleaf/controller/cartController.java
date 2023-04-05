package practice.workshop1.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class cartController {

  @GetMapping("/")
  public String displayLanding(Model model, @RequestParam String item, @RequestParam int quantity) {
    model.addAttribute("cartitem", item);
    model.addAttribute("qty", quantity);
    return "landingPage";
  }

}
