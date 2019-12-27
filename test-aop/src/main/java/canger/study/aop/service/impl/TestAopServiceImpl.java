package canger.study.aop.service.impl;

import canger.study.aop.model.BaseModel;
import canger.study.aop.service.TestAopService;
import org.springframework.stereotype.Service;

import java.io.Serializable;


@Service
public class TestAopServiceImpl implements TestAopService {
    @Override
    public String serve(BaseModel baseModel) {
//        throw new RuntimeException();
        System.out.println("serve: " + baseModel.toString());
        return baseModel.toString();
    }

    @Override
    public String query(String nameStr,int idInt){
        System.out.println("query: "+nameStr +" id: "+idInt);
        return "query method";
    }

    public static String getName(){
        System.out.println("get name in TestAopServiceImpl");
        return "TestAopServiceImpl";
    }
}
