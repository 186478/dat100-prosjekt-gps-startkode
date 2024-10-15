package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSDataConverter {

	
	private static int TIME_STARTINDEX = 11; 

	public static int toSeconds(String timestr) {
		
		int secs;
		int hr, min, sec;
		
		String timestring = timestr.substring(timestr.indexOf("T") + 1, timestr.indexOf("."));
		String [] timeParts = timestring.split(":");

		hr = Integer.parseInt(timeParts[0]);
		min = Integer.parseInt(timeParts[1]);
		sec = Integer.parseInt(timeParts[2]);
		
		secs = (hr*3600) + (min*60) + sec;
		
		return secs;
		
	}

	public static GPSPoint convert(String timeStr, String latitudeStr, String longitudeStr, String elevationStr) {

		GPSPoint gpspoint;
		
		int time = toSeconds(timeStr);
		double latitude = Double.parseDouble(latitudeStr);
		double longitude = Double.parseDouble(longitudeStr);
		double elevation = Double.parseDouble(elevationStr);

		return time;
		return latitude;
		return longitude;
		return elevation;
	
		
	}
	
}
