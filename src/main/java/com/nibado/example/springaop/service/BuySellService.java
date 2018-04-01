package com.nibado.example.springaop.service;

import org.springframework.stereotype.Service;

import com.nibado.example.springaop.my.service.PlacePendingBuySell;

@Service
public class BuySellService implements BuySellServiceInterface {

	/* (non-Javadoc)
	 * @see com.nibado.example.springaop.service.BuySellServiceInterface#performBuySell()
	 */
	@Override
	public void performBuySell() {
		System.out.println(" BuySellService:: performBuySell is called");
	
		writeToTips();
	
	}
	
	
	/* (non-Javadoc)
	 * @see com.nibado.example.springaop.service.BuySellServiceInterface#writeToTips()
	 */
	@Override
	@PlacePendingBuySell
	public void writeToTips() {
		System.out.println("BuySellService==> writeToTips :::  Check if AOP invoked");
	}
}
