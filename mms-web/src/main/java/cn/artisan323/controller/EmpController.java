package cn.artisan323.controller;

import cn.artisan323.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empServiceImpl;

    @RequestMapping("/isemp")
    @ResponseBody
    public Boolean isEmp(){
        Boolean flag = empServiceImpl.isEmp();
        return true;
    }

}
