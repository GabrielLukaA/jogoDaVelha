package jogoDaVelha;

import javax.swing.JOptionPane;

public class jogoDaVelha {

	static String posicao[] = new String[9];
	static boolean vencedor = false;

	public static void main(String[] args) {
		int a;
		for (int c = 0; c < 9; c++) {
			posicao[c] = " ";
		}
		int escolha;
		jogoDaVelha();
		int c = 0;
		for (; c < 9; c++) {
			if (c == 0 || c == 2 || c == 4 || c == 6 || c == 8) {
				JOptionPane.showMessageDialog(null, "Jogador 1");
				escolha = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Em que posição você deseja jogar?(Assuma de 1 a 9 horzizotalmente)"));
				if (posicao[escolha - 1] == " ") {
					posicao[escolha - 1] = "x";
					jogoDaVelha();
				} else {
					JOptionPane.showMessageDialog(null, "Insira uma posição que não foi ocupada ainda.");
					c--;
				}
			} else {
				JOptionPane.showMessageDialog(null, "Jogador 2");
				escolha = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Em que posição você deseja jogar?(Assuma de 1 a 9 horzizotalmente)"));
				if (posicao[escolha - 1] == " ") {
					posicao[escolha - 1] = "o";
					jogoDaVelha();
				} else {
					JOptionPane.showMessageDialog(null, "Insira uma posição que não foi ocupada ainda.");
					c--;
				}
			}
			if (c > 3) {
				c = possibilidadesJogador1(c);
				c = possibilidadesJogador2(c);
			}

		}

		if (c == 9 && vencedor==false) {
			JOptionPane.showMessageDialog(null, "O jogo deu velha.");
		}
	}

	public static void jogoDaVelha() {

		JOptionPane.showMessageDialog(null,
				"  " + posicao[0] + "  |  " + posicao[1] + "  |  " + posicao[2] + "  \n" + "--------------\n" + "  "
						+ posicao[3] + "  |  " + posicao[4] + "  |  " + posicao[5] + "  \n" + "--------------\n" + "  "
						+ posicao[6] + "  |  " + posicao[7] + "  |  " + posicao[8] + "  ");

		return;

	}

	public static int possibilidadesJogador1(int c) {
		if (posicao[0] == "x" && posicao[1] == "x" && posicao[2] == "x") {
			JOptionPane.showMessageDialog(null, "Jogador 1 venceu.");
			c = 10;
			vencedor=true;
		} else if (posicao[3] == "x" && posicao[4] == "x" && posicao[5] == "x") {
			JOptionPane.showMessageDialog(null, "Jogador 1 venceu.");
			c = 10;
			vencedor=true;
		} else if (posicao[6] == "x" && posicao[7] == "x" && posicao[8] == "x") {
			JOptionPane.showMessageDialog(null, "Jogador 1 venceu.");
			c = 10;
			vencedor=true;
		} else if (posicao[0] == "x" && posicao[3] == "x" && posicao[6] == "x") {
			JOptionPane.showMessageDialog(null, "Jogador 1 venceu.");
			c = 10;
			vencedor=true;
		} else if (posicao[1] == "x" && posicao[4] == "x" && posicao[7] == "x") {
			JOptionPane.showMessageDialog(null, "Jogador 1 venceu.");
			c = 10;
			vencedor=true;
		} else if (posicao[2] == "x" && posicao[5] == "x" && posicao[8] == "x") {
			JOptionPane.showMessageDialog(null, "Jogador 1 venceu.");
			c = 10;
			vencedor=true;
		} else if (posicao[0] == "x" && posicao[4] == "x" && posicao[8] == "x") {
			JOptionPane.showMessageDialog(null, "Jogador 1 venceu.");
			c = 10;
			vencedor=true;
		} else if (posicao[2] == "x" && posicao[4] == "x" && posicao[6] == "x") {
			JOptionPane.showMessageDialog(null, "Jogador 1 venceu.");
			c = 10;
			vencedor=true;
		}

		return c;
	}

	public static int possibilidadesJogador2(int c) {
		if (posicao[0] == "o" && posicao[1] == "o" && posicao[2] == "o") {
			JOptionPane.showMessageDialog(null, "Jogador 2 venceu.");
			c = 10;
			vencedor=true;
		} else if (posicao[3] == "o" && posicao[4] == "o" && posicao[5] == "o") {
			JOptionPane.showMessageDialog(null, "Jogador 2 venceu.");
			c = 10;
			vencedor=true;
		} else if (posicao[6] == "o" && posicao[7] == "o" && posicao[8] == "o") {
			JOptionPane.showMessageDialog(null, "Jogador 2 venceu.");
			c = 10;
			vencedor=true;
		} else if (posicao[0] == "o" && posicao[3] == "o" && posicao[6] == "o") {
			JOptionPane.showMessageDialog(null, "Jogador 2 venceu.");
			c = 10;
			vencedor=true;
		} else if (posicao[1] == "o" && posicao[4] == "o" && posicao[7] == "o") {
			JOptionPane.showMessageDialog(null, "Jogador 2 venceu.");
			c = 10;
			vencedor=true;
		} else if (posicao[2] == "o" && posicao[5] == "o" && posicao[8] == "o") {
			JOptionPane.showMessageDialog(null, "Jogador 2 venceu.");
			c = 10;
			vencedor=true;
		} else if (posicao[0] == "o" && posicao[4] == "o" && posicao[8] == "o") {
			JOptionPane.showMessageDialog(null, "Jogador 2 venceu.");
			c = 10;
			vencedor=true;
		} else if (posicao[2] == "o" && posicao[4] == "o" && posicao[6] == "o") {
			JOptionPane.showMessageDialog(null, "Jogador 2 venceu.");
			c = 10;
			vencedor=true;
		}

		return c;
	}
}
