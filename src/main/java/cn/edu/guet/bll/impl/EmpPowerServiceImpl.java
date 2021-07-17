package cn.edu.guet.bll.impl;


import cn.edu.guet.bean.EmpPower;
import cn.edu.guet.bean.MenuTree;
import cn.edu.guet.bll.EmpPowerService;
import cn.edu.guet.mapper.PowerMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmpPowerServiceImpl implements EmpPowerService {
   @Autowired
   private PowerMapper powerMapper;
    @Override
    public MenuTree accountPower(String emp_id) throws Exception {
        List<EmpPower> empPowers=powerMapper.getEmpPower(emp_id);//查询这个用户，并且返回这个用户的权力
        Map<String, List<String>> menuMap=new LinkedHashMap<>();
        for(EmpPower i:empPowers){
            if(!menuMap.containsKey(i.getFather_name())){
                System.out.println("i"+i.getFather_name());
                List<String> QueryPowerList=new ArrayList<>();
                for(EmpPower j:empPowers){
                    if(j.getFather_name().equals(i.getFather_name())){
                        QueryPowerList.add(j.getPower_name());
                        System.out.println("j:"+j.getPower_name());
                    }
                }
                menuMap.put(i.getFather_name(),QueryPowerList);
            }
        }

        MenuTree menuTree=new MenuTree();
        menuTree.setMenutree(menuMap);
        return menuTree;
    }
}
