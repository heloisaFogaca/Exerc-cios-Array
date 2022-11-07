package array;
import java.util.Scanner;
public class vetorAbCSubtracao {
	public static void main(String[] args) {
		double[] vetorA=new double[10], vetorB=new double[10], vetorC=new double[10];
		double subtracao=0.0, numero;
		Scanner scanner=new Scanner(System.in);
		
		for(int contador1=0;contador1<vetorA.length;contador1++) {
			System.out.println("Informe o número:");
			numero=scanner.nextDouble();
			
			vetorA[contador1]=numero;
			}
		for(int contador2=0;contador2<vetorB.length;contador2++) {
			System.out.println("Informe o número:");
			numero=scanner.nextDouble();
			
			vetorB[contador2]=numero;
		}
		for(int contador3=0;contador3<vetorC.length;contador3++) {
			subtracao=vetorA[contador3]-vetorB[contador3];
			vetorC[contador3]=subtracao;
			System.out.println("Subtração "+contador3+" : " +vetorA[contador3]+ " - "+vetorB[contador3]+" = "+vetorC[contador3]);
		}
		scanner.close();
	}

}
