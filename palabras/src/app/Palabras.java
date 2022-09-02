package app;

import java.util.Random;

public class Palabras {
	private char[] alfabeto;
	private String palabra;
	
	public Palabras() {
		this.palabra = "";
		this.alfabeto = new char[] {
				'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
				'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
				'w', 'x', 'y', 'z' 
		};
		
	}
	
	public void formarPalabra() {
		Random rdm = new Random();
		int n = 0;
		for(int i = 0; i < 3; i++) {
			n = rdm.nextInt(alfabeto.length);
			palabra += " " + alfabeto[n];
		}
		System.out.println(palabra);
	}
	
	public void formarPalabra(char letra, int cantidad) {
		Random rdm = new Random();
		int n = 0;
		long totalLetra = 0;
		while(totalLetra < cantidad) {
			palabra = "";
			for(int i = 0; i <= rdm.nextInt(4) + 1; i++) {
				n = rdm.nextInt(alfabeto.length);
				palabra += alfabeto[n] + " ";
			}
			System.out.println(palabra);
			totalLetra = palabra.chars().filter(ch -> ch == letra).count();
		}
		System.out.println(palabra);
	}
}
