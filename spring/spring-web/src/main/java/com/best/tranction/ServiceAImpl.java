package com.best.tranction;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServiceAImpl implements ServiceA {


    public void dosomethingA(){
       throw new RuntimeException("error");
    }

}
