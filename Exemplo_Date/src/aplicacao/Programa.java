package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date dataUm = sdf1.parse("25/06/2020");
		Date dataDois = sdf2.parse("25/04/2020 15:22:05");
		
		System.out.println(dataUm);
		System.out.println(dataDois);
		
		System.out.println("----------------------------");
		
		System.out.println(sdf1.format(dataUm));
		System.out.println(sdf2.format(dataDois));
		
		System.out.println("----------------------------");
		
		Date agora = new Date();
		System.out.println(sdf2.format(agora));
		
		System.out.println("----------------------------");
		
		long mili = System.currentTimeMillis();
		System.out.println(mili);
		
		Date agoraMiliSegundos = new Date(System.currentTimeMillis());
		System.out.println(sdf2.format(agoraMiliSegundos));
		
		System.out.println("----------------------------");
		
		// 'L' identifaca Long para n�o dar erro
		
		Date setMiliSegundosUm = new Date(0L);
		System.out.println(sdf2.format(setMiliSegundosUm));
		
		Date setMiliSegundosDois = new Date(990000000000L);
		System.out.println(sdf2.format(setMiliSegundosDois));
		
		Date setMiliSegundosTres = new Date(1000L * 60L * 60L * 440460L);
		System.out.println(sdf2.format(setMiliSegundosTres));
		
		// Mili segundos tranfomado em segundos 
		// * transformar em minutos 
		// * transformar em horas 
		// * quantidade de horas de 
		// 1/01/1970 ate o dia 31/03/2020 + 3 horas do fuso horario. 
		
		System.out.println("----------------------------");
		
		Date dataTres = Date.from(Instant.parse("2020-03-31T15:23:09Z"));
		System.out.println(dataTres);
		System.out.println(sdf2.format(dataTres));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		System.out.println(sdf3.format(dataTres));
		

	}

}
