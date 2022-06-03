package com.BridgeLabs.day30;

public class InnoviceSummary {
	private int numOfRide;
	private double totalfare;
	private double average;

	public void InvoiceSummary(int numOfRide, double totalFare) {
		this.numOfRide = numOfRide;
		this.totalfare = totalFare;
		this.average = this.totalfare/this.numOfRide;	

	}
}
