package com.lyman.mockserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("bubble")
public class BubbleController {

    private static String status = "0";

    @GetMapping(value = "/test")
    public String test(HttpServletRequest request){

        request.setAttribute("status", status);
        return "bubble";
    }
    @RequestMapping(value = "/alter")
    public String alterStatus(HttpServletRequest request){

        request.setAttribute("status", status);
        return "bubble";
    }


}
