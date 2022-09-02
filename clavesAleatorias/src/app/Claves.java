package app;

import java.util.Random;

public class Claves {
	private char[] alf;
	private int[] num;
	private String clave;
	
	public Claves() {
		this.clave = "";
		this.num = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		this.alf = new char[] {
				'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
				'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
				'w', 'x', 'y', 'z' 
		};
	}
	
	public void formarClave(int tamaño) {
		Random rdm = new Random();
		int n = rdm.nextInt(alf.length);
		clave += String.valueOf(alf[n]).toUpperCase();
		n = rdm.nextInt(num.length);
		String numero = String.valueOf(num[n]);
		char letra;
		
		boolean numero_en_cadena = false;
		for(int i = 0; i < tamaño - 2; i++) {
			letra = alf[rdm.nextInt(alf.length)];
			clave += letra;
			n = rdm.nextInt(2);
			if(!numero_en_cadena) {
				if(n == 1) {
					clave += numero;
					numero_en_cadena = true;
				}
			}
		}
		
		if(!numero_en_cadena) {
			clave += numero;
		}
		
		System.out.println(clave);
	}
}
