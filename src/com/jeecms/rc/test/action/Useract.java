package com.jeecms.rc.test.action;

import com.jeecms.core.entity.CmsRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.jeecms.rc.test.service.UserService;

import java.util.List;

@Controller
public class Useract {
    @RequestMapping("getUser.do")
    //@ResponseBody
    public String getUser(ModelMap modelMap){
        List<CmsRole> list = UserService.getRole();
        modelMap.addAttribute("list", list);
        return "getUser";
    }

    @Autowired
    private UserService UserService;
}
