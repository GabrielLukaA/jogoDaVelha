package atividades12_12;

import java.util.Scanner;

public class atividade1 {

	static String posicao[] = new String[9];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int opcao;
		for (int c = 0; c < 9; c++) {
			posicao[c] = " ";
		}
		int escolha;
		jogoDaVelha();
		int c = 0;
		for (; c < 9; c++) {
			if (c == 0 || c == 2 || c == 4 || c == 6 || c == 8) {
				System.out.println("Jogador 1");
				System.out.println("Em que posição você deseja jogar?(Assuma de 1 a 9 horzizotalmente)");
				escolha = in.nextInt();
				if (posicao[escolha - 1] == " ") {
					posicao[escolha - 1] = "x";
					jogoDaVelha();
				} else {
					System.out.println("Insira uma posição que não foi ocupada ainda.");
					c--;
				}
			} else {
				System.out.println("Jogador 2");
				System.out.println("Em que posição você deseja jogar?(Assuma de 1 a 9 horzizotalmente)");
				escolha = in.nextInt();
				if (posicao[escolha - 1] == " ") {
					posicao[escolha - 1] = "o";
					jogoDaVelha();
				} else {
					System.out.println("Insira uma posição que não foi ocupada ainda.");
					c--;
				}
			}
			if (c > 3) {
				c = possibilidadesJogador1(c);
				c = possibilidadesJogador2(c);
			}

		}
		System.out.println("O jogo deu velha.");

	}

	public static void jogoDaVelha() {

		System.out.println("  " + posicao[0] + "  |  " + posicao[1] + "  |  " + posicao[2] + "  ");
		System.out.println("-----------------");
		System.out.println("  " + posicao[3] + "  |  " + posicao[4] + "  |  " + posicao[5] + "  ");
		System.out.println("-----------------");
		System.out.println("  " + posicao[6] + "  |  " + posicao[7] + "  |  " + posicao[8] + "  ");

		return;

	}

	public static int possibilidadesJogador1(int c) {
		if (posicao[0] == "x" && posicao[1] == "x" && posicao[2] == "x") {
			System.out.println("Jogador 1 venceu.");
			c = 10;
		} else if (posicao[3] == "x" && posicao[4] == "x" && posicao[5] == "x") {
			System.out.println("Jogador 1 venceu.");
			c = 10;
		} else if (posicao[6] == "x" && posicao[7] == "x" && posicao[8] == "x") {
			System.out.println("Jogador 1 venceu.");
			c = 10;
		} else if (posicao[0] == "x" && posicao[3] == "x" && posicao[6] == "x") {
			System.out.println("Jogador 1 venceu.");
			c = 10;
		} else if (posicao[1] == "x" && posicao[4] == "x" && posicao[7] == "x") {
			System.out.println("Jogador 1 venceu.");
			c = 10;
		} else if (posicao[2] == "x" && posicao[5] == "x" && posicao[8] == "x") {
			System.out.println("Jogador 1 venceu.");
			c = 10;
		} else if (posicao[0] == "x" && posicao[4] == "x" && posicao[8] == "x") {
			System.out.println("Jogador 1 venceu.");
			c = 10;
		} else if (posicao[2] == "x" && posicao[4] == "x" && posicao[6] == "x") {
			System.out.println("Jogador 1 venceu.");
			c = 10;
		}

		return c;
	}

	public static int possibilidadesJogador2(int c) {
		if (posicao[0] == "o" && posicao[1] == "o" && posicao[2] == "o") {
			System.out.println("Jogador 2 venceu.");
			c = 10;
		} else if (posicao[3] == "o" && posicao[4] == "o" && posicao[5] == "o") {
			System.out.println("Jogador 2 venceu.");
			c = 10;
		} else if (posicao[6] == "o" && posicao[7] == "o" && posicao[8] == "o") {
			System.out.println("Jogador 2 venceu.");
			c = 10;
		} else if (posicao[0] == "o" && posicao[3] == "o" && posicao[6] == "o") {
			System.out.println("Jogador 2 venceu.");
			c = 10;
		} else if (posicao[1] == "o" && posicao[4] == "o" && posicao[7] == "o") {
			System.out.println("Jogador 2 venceu.");
			c = 10;
		} else if (posicao[2] == "o" && posicao[5] == "o" && posicao[8] == "o") {
			System.out.println("Jogador 2 venceu.");
			c = 10;
		} else if (posicao[0] == "o" && posicao[4] == "o" && posicao[8] == "o") {
			System.out.println("Jogador 2 venceu.");
			c = 10;
		} else if (posicao[2] == "o" && posicao[4] == "o" && posicao[6] == "o") {
			System.out.println("Jogador 2 venceu.");
			c = 10;
		}

		return c;
	}
}
