package com.wwkkww.formvalidation;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {
  
  @GetMapping("/")
  public String getForm(Model model) {
    model.addAttribute("user", new User());
    return "signup";
  }

  @GetMapping("/result")
  public String getResult() {
    return "result";
  }

  @PostMapping("/submitItem")
  public String handleSubmit(@Valid User user, BindingResult result) {
    if (user.getFirstName().equals(user.getLastName())) result.rejectValue("lastName", "", "please enter valid data");
    
    if (result.hasErrors()) return "signup";
    return "redirect:/result";
  }

}
