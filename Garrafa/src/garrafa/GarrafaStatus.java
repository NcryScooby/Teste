package garrafa;

public class GarrafaStatus {
	
	String fabricante;
	String cor;
	double tamanho;
	boolean cheio;
	
	void status() {
		
		System.out.println("Garrafa marca " + this.fabricante);
		System.out.println("Garrafa de cor " + this.cor);
		
		if (this.tamanho <= 10) {
			System.out.printf("Garrafa de tamanho %.1fL\n", this.tamanho);
		} else {
			System.out.printf("Garrafa de tamanho %.0fML\n", this.tamanho);
		}
		
		
		if (this.cheio == true) {
			System.out.println("Garrafa está cheia");
		} else {
			System.out.println("Garrafa não está cheia");
		}
		
	}
	
	void beber() {
		
		if (this.cheio == true) {
			System.out.println("Portanto você pode beber!");
		} else {
			System.out.println("Portanto você não pode beber!");
		}
		
	}

	
	void encher() {
		
		if (this.cheio == true) {
			System.out.println("Você não precisa encher");
		} else {
			System.out.println("Você precisa encher");
		}
		
	}
	

}
