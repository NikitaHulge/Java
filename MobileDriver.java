package com.jsp.Encapsulation;

public class MobileDriver {

	public static void main(String args[]) {
		Mobile m1=new Mobile("Moto","Fusion30","12GB",40000.0);
		
		m1.setSim1(new Sim1("Airtel",7021522483L));
		m1.setSim2(new Sim2("Jio",9967285032L));
		m1.printMobileDetails();
	}
}
