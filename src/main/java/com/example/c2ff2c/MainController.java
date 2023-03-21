package com.example.c2ff2c;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class MainController {

    @PostMapping("/C2F")
    String celsiusToFahrenheit(@ModelAttribute Degree degree, Model model){

        model.addAttribute("startDegree",degree.getStartDegree());
        model.addAttribute("convertedDegree",degree.getC2F());

        return "index";
    }

    @PostMapping("/F2C")
    String fahrenheitToCelsius(@ModelAttribute Degree degree, Model model){

        model.addAttribute("startDegree",degree.getStartDegree());
        model.addAttribute("convertedDegree",degree.getF2C());

        return "index";
    }

    @GetMapping("/")
    String home(){
        return "index";
    }


}
