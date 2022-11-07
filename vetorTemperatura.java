package array;
import java.util.Scanner;
public class vetorTemperatura {
		public static void main(String [] args){
			double temperatura=0.0, media, maiorTemperatura=0.0, menorTemperatura=45.0, soma=0.0;
			double[] temperaturaDia=new double[6];
			Scanner scanner = new Scanner(System.in);
			
			for(int contador=0;contador<temperaturaDia.length;contador++) {
				System.out.println("Informe a temperatura em Celsius(entre 15 e 40 graus):");
				temperatura=scanner.nextDouble();
				soma+=temperatura;
				temperaturaDia[contador]=temperatura;
				
				if(temperatura>maiorTemperatura) {
					maiorTemperatura=temperaturaDia[contador];
				} if(temperatura<menorTemperatura) {
					menorTemperatura=temperaturaDia[contador];
				}
			}
			media=soma/6;
			System.out.println("A mior temperatura é: "+maiorTemperatura+"\nA menor temperatura é: "+menorTemperatura+"\nA média das tempesraturas é:"+media);
	}
		
}

