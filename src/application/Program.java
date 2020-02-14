package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {
	public static void main(String[] args) throws ParseException {
		/*
		 * Padrao ISO 8601 e classes instant
		 * Formato: yyyy-MM-ddTHH:mm:ssZ
		 * 
		 *         ano mes dia T hora minuto segundo Z === a letra T e Z indicam que eh um formato UTC
		 * 
		 * Exemplo:"2018-06-25T15:42:07Z"
		 * 
		 * Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")
		 * 
		 */
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		//cal.add(Calendar.HOUR_OF_DAY, 4);
		//d = cal.getTime();
		
		
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println(sdf.format(d));
		System.out.println("minutes: " + minutes);
		System.out.println("Mounth: " + month);
		
		
		
		
	}

}
