package com.BridgeLabs.day30;
import org.junit.Assert;
import org.junit.Test;

public class InnoviceServiceTest3 {
	@Test
	public void givenMultipleRide_ShouldReturnInvoiceSummary() {
		InvoiceGenerator_2 invoiceGenerator = new InvoiceGenerator_2();
		Ride[] rides = {
				new Ride (2.0 , 5),
				new Ride (0.1, 1)
		};
		double summary = invoiceGenerator.CalculateFare(rides);
		InnoviceSummary expectedInvoiceSummary = new InnoviceSummary();
		Assert.assertEquals(expectedInvoiceSummary,summary);	
	}
}
