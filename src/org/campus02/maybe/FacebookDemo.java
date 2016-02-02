package org.campus02.maybe;

import java.util.GregorianCalendar;

public class FacebookDemo {

	public static void main(String[] args) {
		
		MayBeInt alter = new MayBeInt(26, MayBeInt.ZugriffErlaubt);
		
		alter.printData();
		alter.setStatus(MayBeInt.ZugriffVerboten);
		alter.printData();
		
		MayBeString city = new MayBeString("Graz", MayBeString.ZugriffErlaubt);
		
		city.printData();
		city.setStatus(MayBeInt.NichtVorhanden);
		city.printData();
		
		MayBe<GregorianCalendar> gebDatum = new MayBe<GregorianCalendar>(new GregorianCalendar(1988, 8, 8), MayBe.ZugriffErlaubt);
		
		gebDatum.printData();
		
		MayBe<Integer> gehalt = new MayBe<Integer>(new Integer(1000), MayBe.ZugriffVerboten);
		
		gehalt.printData();
	}
}
