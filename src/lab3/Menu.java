package lab3;

import java.util.Scanner;

/**
 * Representação do Menu,, onde o úsuario pode escolher entre cadastrar um
 * contato, exibir um contato , e listar os contatos que foram cadastrados.
 * 
 * @author Gabriel Menezes Cabral Matrícula: 119110372
 *
 */
public class Menu {

	/**
	 * Responsável por pegar as entradas inseridas pelo úsuario.
	 */
	static Scanner ler = new Scanner(System.in);

	/**
	 * Cria um objeto chamado agenda para que o contato possa ser cadastrado na
	 * classe Agenda.
	 */
	static Agenda agenda = new Agenda();

	/**
	 * Se o método ehPossivelCadastrar verificar que a poção está dentro do
	 * intervalo permitido, então ele vai pedir para o úsuario continuar o cadastro
	 * do contato com o nome, sobrenome e telefone. Se não for possível cadastrar
	 * então ele vai retornar "POSSIÇÃO INVÁLIDA!". Depois ele envia essas
	 * informções para o método cadstraContato na Classe Agenda. Se for possível
	 * Cadastrar, no final ele vai retornar "CADASTRO REALIZADO!".
	 * 
	 */
	public static boolean cadastrar() {

		System.out.print("\nPosição: ");
		int posicao = ler.nextInt();
		ler.nextLine();
		if (!(ehPossivelCadastrar(posicao))) {
			System.out.println("POSIÇÃO INVÁLIDA!\n");
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
	 * Se a posição do contato estiver entre 1 e 100 então ele retorna true, e se
	 * não estiver ele retorna false.
	 * 
	 * @param posicao é a posição que o contato vai ser cadastrado na agenda.
	 * @return true ou false dependendo se a condição foi atingida.
	 */
	public static boolean ehPossivelCadastrar(int posicao) {
		if (posicao >= 1 && posicao <= 100) {
			return true;
		}
		return false;
	}

	/**
	 * Esse método recebe a posição do contato que o úsuario quer que seja exibido e
	 * manda como parâmetro no método exibirContato lá na Classe Agenda para exibir
	 * o contato pedido.
	 */
	public static void exibir() {
		System.out.print("Contato> ");
		int posicaoContato = ler.nextInt();
		System.out.println();

		agenda.exibirContato(posicaoContato);
	}

	/**
	 * Chama o método na Classe Agenda responsável por listar os contatos que foram
	 * cadastrados.
	 */
	public static void listar() {
		System.out.println();
		agenda.listarContatos();
		System.out.println();
	}

	public static void main(String[] args) {

		/**
		 * É o Menu de opções que o úsuario pode escolher para ser executado.
		 * Se ele digitar "C" vai chamar o método cadastrar, que vai cadastrar um contato.
		 * Se ele digitar "L" vai chamar o método listar, que vai listar os contatos cadastrados.
		 * Se ele digitar "E" vai chamar o método exibir, que vai exibir um contato que ele escolher.
		 * Se ele digitar "S" encerrar o programa.
		 * 
		 *  Enquanto o úsuario não digitar para Sair, o menu será reiniciado.
		 */
		do {
			System.out.println("(C)adastrar Contato");
			System.out.println("(L)istar Contatos");
			System.out.println("(E)xibir Contato");
			System.out.println("(S)air\n");
			System.out.print("Opção> ");

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
				System.out.println("OPÇÃO INVÁLIDA!");
				System.out.println();
			}
		} while (true);

	}
}