package com.BridgeLabs.day30;
import org.junit.Assert;
import org.junit.Test;

public class InnoviceServiceTest2 {
	@Test
	public void givenMultipleRide_ShouldReturnTotalFare() {
		InvoiceGenerator_2 invoiceGenerator = new InvoiceGenerator_2();
		Ride[] rides = {
				new Ride (2.0 , 5),
				new Ride (0.1, 1)
		};
		double fare = invoiceGenerator.CalculateFare(rides);
		Assert.assertEquals(30,fare,0.0);

	}
}
