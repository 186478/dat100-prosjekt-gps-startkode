package no.hvl.dat100ptc.oppgave1;

public class Main {

	public static void main(String[] args) {
		

		GPSPoint point = new GPSPoint(0, 0, 0, 0);
				
		point.setTime(1);
		point.setLatitude(2.0);
		point.setLongitude(2.0);
		point.setElevation(5.0);
		
		System.out.println("Tid: " + point.getTime() + "sewkunder");
		System.out.println("høydegrad: " + point.getLatitude());
		System.out.println("lengdegrad: " + point.getLongitude());
		System.out.println("høyde: " + point.getElevation() + "meter");
		
		System.out.println(point.toString());
		
	}
	

}
