package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSDataConverter {

	
	private static int TIME_STARTINDEX = 11; 

	public static int toSeconds(String timestr) {
		
		int secs;
		int hr, min, sec;
		
		timestr = timestr.replaceAll("2017-08-13T", "");
		timestr = timestr.replaceAll(".000Z", "");
		String [] timeParts = timestr.split(":");

		hr = Integer.parseInt(timeParts[0]);
		min = Integer.parseInt(timeParts[1]);
		sec = Integer.parseInt(timeParts[2]);
		
		secs = (hr*3600) + (min*60) + sec;
		
		//return secs;
		System.out.print(secs);
	}

	public static GPSPoint convert(String timeStr, String latitudeStr, String longitudeStr, String elevationStr) {

		GPSPoint gpspoint;

		// TODO 
		throw new UnsupportedOperationException(TODO.method());
		
	}
	
}
