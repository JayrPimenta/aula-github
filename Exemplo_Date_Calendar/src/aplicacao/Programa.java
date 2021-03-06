package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formatoDaData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date data = Date.from(Instant.parse("2020-03-31T15:39:54Z"));		
		System.out.println(formatoDaData.format(data));
		
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		
		System.out.println("-------------------");

		calendario.add(Calendar.HOUR_OF_DAY, 4);
		data = calendario.getTime();
		System.out.println(formatoDaData.format(data));
		
		calendario.add(Calendar.MINUTE, 10);
		data = calendario.getTime();
		System.out.println(formatoDaData.format(data));
		
		calendario.add(Calendar.DAY_OF_WEEK, 2);
		data = calendario.getTime();
		System.out.println(formatoDaData.format(data));
		
		calendario.add(Calendar.DAY_OF_MONTH, 1);
		data = calendario.getTime();
		System.out.println(formatoDaData.format(data));
		
		System.out.println("-------------------");
		
		int ano = calendario.get(Calendar.YEAR);
		int mes = calendario.get(Calendar.MONTH);
		int dia = calendario.get(Calendar.DAY_OF_MONTH);
		int diaDaSemana = calendario.get(Calendar.DAY_OF_WEEK);
		int horas = calendario.get(Calendar.HOUR);
		int horasADD = calendario.get(Calendar.HOUR) + 5;
		int minutos = calendario.get(Calendar.MINUTE);
		int segundos = calendario.get(Calendar.SECOND);
		System.out.println("Horas: " +horas);
		System.out.println("Horas somadas: " +horasADD);
		System.out.println("Minutos: "+minutos);
		System.out.println("Segundos: "+segundos);
		System.out.println("Ano: "+ano);
		System.out.println("M�s: "+mes);
		System.out.println("Dia: "+dia);
		System.out.println("Dia da semana: "+diaDaSemana);	
		
		// dia da semana complemento
		
		String semana;
		
		switch (diaDaSemana) {
		case 1: 
			semana = "Domingo";
			break;
			
		case 2:
			semana = "Segunda";
			break;
			
		case 3:
			semana = "Ter�a";
			break;
			
		case 4:
			semana = "Quarta";
			break;
			
		case 5:
			semana = "Quinta";
			break;
			
		case 6:
			semana = "Sexta";
			break;
			
		case 7:
			semana = "Sabado";
			break;
			
		default:
			semana = "dia invalido";
			break;
		}
		
		
		System.out.println("Dia da semana: "+semana);
		
		
		
		
		
		
	}

}
