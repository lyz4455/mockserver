package com.lyman.mockserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("bubble")
public class BubbleController {

    private static String bubbleStatus = "1";
    private static final String ZERO = "0";
    private static final String ONE = "1";

    @GetMapping(value = "/index")
    public ModelAndView index(){
        ModelAndView mdv = new ModelAndView();
        //要跳转的页面
        mdv.setViewName("bubble");
        return mdv;
    }
    @RequestMapping(value = "/alter/{status}")
    @ResponseBody
    public String alterStatus(@PathVariable String status){
        if(ZERO.equals(status)){
            bubbleStatus = ZERO;
        }else if (ONE.equals(status)){
            bubbleStatus = ONE;
        }
        return bubbleStatus;
    }
    @RequestMapping(value = "/backIndex")
    @ResponseBody
    public String backIndex(){
        return bubbleStatus;
    }


}
