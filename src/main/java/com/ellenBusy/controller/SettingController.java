package com.ellenBusy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wangyin on 2016/7/2.
 */
@Controller
public class SettingController {
   @RequestMapping("/setting")
   @ResponseBody
    public String setting(){
       return "Setting:OK";
   }

}
