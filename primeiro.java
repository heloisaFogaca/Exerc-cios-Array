package array;
import java.util.Scanner;
public class primeiro {
	public static void main(String[] args) {
		double soma=0.0, valorVenda, percentual,valorReceber=0.0, maior=0.0, menor=100000000.0 ;
		String nomeVendedor, maiorNome="aa", menorNome="bb";
		double [] totalVendas=new double[10], percentualComissao=new double[10], totalReceber=new double[10];
		String[] nome=new String[2];
		Scanner scanner=new Scanner(System.in);
		
		for(int contador1=0;contador1<totalVendas.length;contador1++) {
			System.out.println("Informe o total de vendas:");
			valorVenda=scanner.nextDouble();
			totalVendas[contador1]=valorVenda;
			soma+=valorVenda;
		}
		for(int contador2=0;contador2<percentualComissao.length;contador2++) {
			System.out.println("Informe o pecentual de comissão:");
			percentual=scanner.nextDouble();
			percentualComissao[contador2]=percentual;
			percentual=percentual/100;
			valorReceber=totalVendas[contador2]+(totalVendas[contador2]*percentual);
			totalReceber[contador2]=valorReceber;
			
		}
		for(int contador3=0;contador3<totalVendas.length;contador3++) {
			System.out.println("Informe o nome do vendedor:");
			nomeVendedor=scanner.next();
			nome[contador3]=nomeVendedor;
			if(totalReceber[contador3]>maior) {
				maior=totalReceber[contador3];
				maiorNome=nomeVendedor;
			} if(totalReceber[contador3]<menor) {
				menor=totalReceber[contador3];
				menorNome=nomeVendedor;
			}
			for(int contador4=1;contador4<totalVendas.length;contador4++) {
				System.out.println(contador4+" - " +totalVendas[contador4]);
				System.out.println(contador4+" - " +totalReceber[contador4]);
			}
			System.out.println("Total de vendas:"+soma);
			System.out.println("O maior valor a receber: "+maior+ "\nQuem o receberá: "+maiorNome);
			System.out.println("O menor valor a receber: "+menor+"\nQuem o receberá: "+menorNome);
		}
		scanner.close();
		
	}
	

}