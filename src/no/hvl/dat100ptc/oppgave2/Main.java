package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class Main {

	public static void main(String[] args) {

        GPSPoint point1 = new GPSPoint(1, 60.38, 5.332, 50.0);
        GPSPoint point2 = new GPSPoint(2, 60.38, 5.3, 60.0);
        GPSPoint point3 = new GPSPoint(2, 70.389, 5.33, 60.0);

       
        GPSData gpsData = new GPSData(3);

       
        gpsData.insertGPS(point1);
        gpsData.insertGPS(point2);
        gpsData.insertGPS(point3);

     
        gpsData.print();
    }
	
}
