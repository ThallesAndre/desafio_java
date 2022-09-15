import java.util.Scanner;

import ententies.Bill;

public class Aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		Bill x = new Bill(); 
		
		System.out.print("Sexo: ");
		x.gender = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		x.beer =  sc.nextInt();	
		System.out.print("Quantidade de refrigerantes: ");
		x.softDrink =  sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		x.barbecue =  sc.nextInt();
	
		
		System.out.println(" Relatorio" );
		System.out.printf(" Consumo: R$ %.2f%n",x.feeding() );
		
		if (x.cover() == 0) {
			System.out.println("Isento de Couvert");
		}
		else {
			System.out.printf(" Cover: R$ %.2f%n",x.cover() );	
		}
		System.out.printf(" Valor ticket: R$ %.2f%n",x.ticket());
		System.out.println("" );
		System.out.printf(" Valor a pagar:R$ %.2f%n",x.total() );
		
		

		sc.close();
	}

}
