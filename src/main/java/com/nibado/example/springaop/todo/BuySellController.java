package com.nibado.example.springaop.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nibado.example.springaop.my.service.PlacePendingBuySell;
import com.nibado.example.springaop.service.BuySellServiceInterface;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/buysell")
@Slf4j
public class BuySellController {

	@Autowired
	BuySellServiceInterface buySellService;
	
	@RequestMapping(value = "/print", method = RequestMethod.GET, produces = "application/json")
   // @PlacePendingBuySell
    public void print() {
    	System.out.println("TodoController ::   print method is done ");
    	
    	
    	buySellService.performBuySell();
    	
    	
    }
	
}
