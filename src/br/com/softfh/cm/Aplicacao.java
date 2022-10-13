package br.com.softfh.cm;

import br.com.softfh.cm.modelo.Tabuleiro;
import br.com.softfh.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		
		new TabuleiroConsole(tabuleiro);
		
	}
}
