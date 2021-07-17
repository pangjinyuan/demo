package cn.edu.guet.mapper;


import cn.edu.guet.bean.EmpPower;

import java.util.List;

public interface PowerMapper {
   public List<EmpPower> getEmpPower(String emp_id);
}
