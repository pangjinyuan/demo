package cn.edu.guet.controller;

import cn.edu.guet.bean.EmpAccount;
import cn.edu.guet.bean.MenuTree;
import cn.edu.guet.bll.EmpPowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PowerController {
    @Autowired
    private EmpPowerService powerService;
    @RequestMapping(value = "Main.do")
    @ResponseBody
    public MenuTree accountPower(EmpAccount emp) throws Exception {

        return powerService.accountPower(emp.getEmp_id());
    }
}


