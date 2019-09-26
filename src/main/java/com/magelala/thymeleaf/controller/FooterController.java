package com.magelala.thymeleaf.controller;

import com.magelala.thymeleaf.service.FooterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class FooterController {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private FooterService footerService;

    @GetMapping({"/","/index"})
    public String index(Model model){
        model.addAttribute("footer",footerService.selectById(1));
        return "index";
    }

    @GetMapping("/message")
    public String test(Model model){
        request.getSession().setAttribute("footerSession",footerService.selectById(1));
        model.addAttribute("test1",footerService.selectById(1));
        model.addAttribute("date",new Date());
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        model.addAttribute("list",list);
        request.setAttribute("path","images/banner1.jpg");
        model.addAttribute("lists",footerService.selectAll());
        return "message";
    }
}
