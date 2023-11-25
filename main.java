public class main {
	public static void main(String[] args) {
		
		banco p1 = new banco();
		p1.setNumconta(111);
		p1.setDono("Jubileu");
		p1.abrirConta("CC");
		
		banco p2 = new banco();
		p2.setNumconta(222);
		p2.setDono("fulana");
		p2.abrirConta("CP");
		
		p1.depositar(100);
		p2.depositar(200);
		p2.sacar(100);
		
		p1.stadoAtual();
		p2.stadoAtual();
	}
}
