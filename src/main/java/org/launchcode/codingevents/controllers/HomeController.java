package org.launchcode.codingevents.controllers;

import org.springframework.sterotype.Controller;
import org.springframework.web.blind.annotation.GetMapping;


@Controller
public class HomeController {
@GetMapping
    public String index() {
    return "index";
}
}
