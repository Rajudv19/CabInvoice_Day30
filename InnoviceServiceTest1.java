package com.BridgeLabs.day30;
import org.junit.Assert;
import org.junit.Test;

public class InnoviceServiceTest1 {
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		InvoiceGenerator_1 invoiceGenerator = new InvoiceGenerator_1();
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGenerator.CalculateFare(distance, time);
		Assert.assertEquals(25,fare,0.0);

	}
}
