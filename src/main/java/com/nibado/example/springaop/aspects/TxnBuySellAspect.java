package com.nibado.example.springaop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class TxnBuySellAspect {
   
	//running below
    @After("@annotation(com.nibado.example.springaop.my.service.PlacePendingBuySell) && execution(public * *(..))")
    public void placePendingBuySell() {
    	System.out.println("=============>>>>>>>>>TxnBuySellAspect:: Aspect Invoked : in PlacePendingBuySell called<<<<<<<<<=====================");
    }

//    @After("@annotation(com.nibado.example.springaop.uri.PlacePendingBuySell) && execution(public * *(..))")
//    public void placePendingBuySell1() {
//    	System.out.println("TxnBuySellAspect:: Aspect Invoked : in PlacePendingBuySell called");
//    }
//    
    
}
