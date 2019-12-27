package canger.study.aop.service;


import canger.study.aop.model.BaseModel;


public interface TestAopService {
    String serve(BaseModel baseModel);
    String query(String nameStr,int idInt);
}
