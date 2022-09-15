import java.util.Scanner;

import ententies.Bill;

public class Aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Bill x;
		x= new Bill(); 
		
		System.out.print("Sexo: ");
		x.gender = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		x.beer =  sc.nextInt();	
		System.out.print("Quantidade de refrigerantes: ");
		x.softDrink =  sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		x.barbecue =  sc.nextInt();
	
		
		double valor_Feeding = x.feeding();
		double  valor_Ticket = x.ticket();
		double valor_Total = x.total();
		double valor_Cover = x.cover();
		
		System.out.println(" Relatorio" );
		System.out.printf(" Consumo: %.2f%n",valor_Feeding );
		System.out.printf(" Cover: : %.2f%n",valor_Cover );
		System.out.printf(" Valor ticket: %.2f%n",valor_Ticket );
		System.out.println("" );
		System.out.printf(" Valor a pagar: %.2f%n",valor_Total );
		
		

		sc.close();
	}

}
