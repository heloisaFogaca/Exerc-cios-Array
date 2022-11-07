package array;
import java.util.Scanner;
public class vetorParesImpares {
	public static void main(String[] args) {
		double numero, contadorPar=0.0, contadorImpar=0.0;
		double[] numeros=new double[6];
		Scanner scanner= new Scanner(System.in);
		
		for(int contador=0;contador<numeros.length;contador++) {
			System.out.println("Informe o número:");
			numero=scanner.nextDouble();
			numeros[contador]=numero;
			if(numero%2==0) {
				contadorPar++;
				System.out.println(numeros[contador]+" é par");
			} else {
				contadorImpar++;
				System.out.println(numeros[contador]+" é ímpar");
			}
		}
		System.out.println("Há \nNúmeros pares: "+contadorPar+"\nNúmeros ímpares: "+contadorImpar);
		scanner.close();		
	}

}