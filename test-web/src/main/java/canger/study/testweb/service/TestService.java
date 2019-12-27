package canger.study.testweb.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@Service
@Scope("singleton")
public class TestService {
    public void find(){
        System.out.println(this.toString() + " TestService Find");
    }
}
