package Main;

import javax.swing.JFrame;

//import em tela

public class Main {
//Rodar a tela do jogo
	public static void main(String[] args) {
		//instância da tela
		JFrame window = new JFrame();
		//fechar a janela propriamente
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Space Invader Type");
		
		//Instância da subclasse painel
		Painel Painel = new Painel();	
		window.add(Painel);
		window.pack();
		
		//deixa a tela no meio
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		Painel.startjogoThread();
		
		
		
	}

}
