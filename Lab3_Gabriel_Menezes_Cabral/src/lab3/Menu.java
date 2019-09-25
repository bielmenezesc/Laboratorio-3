package lab3;

import java.util.Scanner;

/**
 * Representa��o do Menu,, onde o �suario pode escolher entre cadastrar um
 * contato, exibir um contato , e listar os contatos que foram cadastrados.
 * 
 * @author Gabriel Menezes Cabral Matr�cula: 119110372
 *
 */
public class Menu {

	/**
	 * Respons�vel por pegar as entradas inseridas pelo �suario.
	 */
	static Scanner ler = new Scanner(System.in);

	/**
	 * Cria um objeto chamado agenda para que o contato possa ser cadastrado na
	 * classe Agenda.
	 */
	static Agenda agenda = new Agenda();

	/**
	 * Se o m�todo ehPossivelCadastrar verificar que a po��o est� dentro do
	 * intervalo permitido, ent�o ele vai pedir para o �suario continuar o cadastro
	 * do contato com o nome, sobrenome e telefone. Se n�o for poss�vel cadastrar
	 * ent�o ele vai retornar "POSSI��O INV�LIDA!". Depois ele envia essas
	 * inform��es para o m�todo cadstraContato na Classe Agenda. Se for poss�vel
	 * Cadastrar, no final ele vai retornar "CADASTRO REALIZADO!".
	 * 
	 */
	public static boolean cadastrar() {

		System.out.print("\nPosi��o: ");
		int posicao = ler.nextInt();
		ler.nextLine();
		if (!(ehPossivelCadastrar(posicao))) {
			System.out.println("POSI��O INV�LIDA!\n");
			return false;
		}

		System.out.printf("Nome: ");
		String nome = ler.nextLine();

		System.out.printf("Sobrenome: ");
		String sobrenome = ler.nextLine();

		System.out.printf("Telefone: ");
		String telefone = ler.nextLine();
		System.out.println("CADASTRO REALIZADO!\n");

		agenda.cadastraContato(posicao, nome, sobrenome, telefone);

		return true;

	}

	/**
	 * Se a posi��o do contato estiver entre 1 e 100 ent�o ele retorna true, e se
	 * n�o estiver ele retorna false.
	 * 
	 * @param posicao � a posi��o que o contato vai ser cadastrado na agenda.
	 * @return true ou false dependendo se a condi��o foi atingida.
	 */
	public static boolean ehPossivelCadastrar(int posicao) {
		if (posicao >= 1 && posicao <= 100) {
			return true;
		}
		return false;
	}

	/**
	 * Esse m�todo recebe a posi��o do contato que o �suario quer que seja exibido e
	 * manda como par�metro no m�todo exibirContato l� na Classe Agenda para exibir
	 * o contato pedido.
	 */
	public static void exibir() {
		System.out.print("Contato> ");
		int posicaoContato = ler.nextInt();
		System.out.println();

		agenda.exibirContato(posicaoContato);
	}

	/**
	 * Chama o m�todo na Classe Agenda respons�vel por listar os contatos que foram
	 * cadastrados.
	 */
	public static void listar() {
		System.out.println();
		agenda.listarContatos();
		System.out.println();
	}

	public static void main(String[] args) {

		/**
		 * � o Menu de op��es que o �suario pode escolher para ser executado.
		 * Se ele digitar "C" vai chamar o m�todo cadastrar, que vai cadastrar um contato.
		 * Se ele digitar "L" vai chamar o m�todo listar, que vai listar os contatos cadastrados.
		 * Se ele digitar "E" vai chamar o m�todo exibir, que vai exibir um contato que ele escolher.
		 * Se ele digitar "S" encerrar o programa.
		 * 
		 *  Enquanto o �suario n�o digitar para Sair, o menu ser� reiniciado.
		 */
		do {
			System.out.println("(C)adastrar Contato");
			System.out.println("(L)istar Contatos");
			System.out.println("(E)xibir Contato");
			System.out.println("(S)air\n");
			System.out.print("Op��o> ");

			String opcaoEscolhida = ler.next();

			if (opcaoEscolhida.equals("C")) {
				cadastrar();

			} else if (opcaoEscolhida.equals("L")) {
				listar();

			} else if (opcaoEscolhida.equals("E")) {
				exibir();

			} else if (opcaoEscolhida.equals("S")) {
				break;
			} else {
				System.out.println("OP��O INV�LIDA!");
				System.out.println();
			}
		} while (true);

	}
}