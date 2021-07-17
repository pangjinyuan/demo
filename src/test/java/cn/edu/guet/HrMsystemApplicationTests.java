package cn.edu.guet;

import cn.edu.guet.bean.EmpPower;
import cn.edu.guet.mapper.AccountMapper;
import cn.edu.guet.mapper.PowerMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class HrMsystemApplicationTests {
    @Autowired
    private PowerMapper powerMapper;
    @Test
    void contextLoads() {
    }
    @Test
    void testpower() throws Exception {
        String emp_id="M1000";
        List<EmpPower> list=powerMapper.getEmpPower(emp_id);
        for(EmpPower empPower:list){
            System.out.println(empPower.getPower_name());
        }

    }
}
