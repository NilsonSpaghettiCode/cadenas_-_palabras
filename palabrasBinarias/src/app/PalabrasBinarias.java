package app;

import java.util.Random;

public class PalabrasBinarias {
	private byte[] alfBin;
	
	public PalabrasBinarias() {
		this.alfBin = new byte[] {0, 1};
	}
	
	public void formarPalabraBinaria() {
		Random rdm = new Random();
		String palabra = "";
		for(int i = 0; i <= rdm.nextInt(4) + 1; i++) {
			palabra += alfBin[rdm.nextInt(alfBin.length)];
		}
		System.out.println("Binario: " + palabra);
		System.out.println("Decimal: " + Integer.parseInt(palabra, alfBin.length));
	}
}
