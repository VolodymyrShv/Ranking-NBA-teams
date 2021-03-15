package my.kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {

	public static void main(String[] args) {
		
	    
		String r = "Los 76ers 21 Dallas Mavericks 88,New York Knicks 76 Atlanta Hawks 21jd 112,"
				+ "Los Angeles Clippers 104 Dallas Mavericks 88,New York Knicks 101 Atlanta Hawks 112,"
				+ "Indiana Pacers 103 Memphis Grizzlies 112,Los Angeles Clippers 100 Boston Celtics 120";
		
		Kata2 kat = new Kata2();
		List <Integer> listq = new ArrayList<Integer>();
		List <String> listq1 = new ArrayList<String>();

		listq = kat.getScore(r);
		listq1 = kat.getTeamName(r);

		for (String value: listq1) {
			System.out.println(value);
		}
		
		
	}

}
