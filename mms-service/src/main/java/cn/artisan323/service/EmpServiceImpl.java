package cn.artisan323.service;

import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {
    @Override
    public Boolean isEmp() {
        return true;
    }
}
