package garrafa;

public class Garrafa {
	
	public static void main (String[] args) {
		
		GarrafaStatus g1 = new GarrafaStatus();
		
		g1.fabricante = "Água da Pedra";
		g1.cor = "Transparente";
		g1.tamanho = 500;
		g1.cheio = false;
		g1.status();
		g1.encher();
		g1.beber();
		
		System.out.println();
		
		GarrafaStatus g2 = new GarrafaStatus();
		
		g2.fabricante = "Voss";
		g2.cor = "Transparente";
		g2.tamanho = 2;
		g2.cheio = true;
		g2.status();
		g2.encher();
		g2.beber();
		
		System.out.println();
		
		GarrafaStatus g3 = new GarrafaStatus();
		
		g3.fabricante = "Crystal";
		g3.cor = "Azul";
		g3.tamanho = 500;
		g3.cheio = true;
		g3.status();
		g3.encher();
		g3.beber();
		
		System.out.println();
		
		GarrafaStatus g4 = new GarrafaStatus();
		
		g4.fabricante = "Panvel";
		g4.cor = "Verde";
		g4.tamanho = 1.5;
		g4.cheio = true;
		g4.status();
		g4.encher();
		g4.beber();
		
		
	}

}
