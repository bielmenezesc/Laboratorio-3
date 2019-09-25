package lab3;

/**
 * Representa��o de uma agenda de contatos.
 * 
 * @author Gabriel Menezes Cabral
 *
 */
public class Agenda {

	/**
	 * � um array respons�vel por guardar os contatos.
	 */
	private Contato[] listaContatos;

	/**
	 * � um construtor. Nele est� indicando o tamnaho do Array listaContatos.
	 */
	public Agenda() {
		this.listaContatos = new Contato[100];

	}

	/**
	 * Cadastra o contato no Array listaContatos, de acordo com a posi��o.
	 * 
	 * @param posica    � a posi��o do contato.
	 * @param nome      � o nome do contato.
	 * @param sobrenome � o sobrenome do contato.
	 * @param telefone  � o telefone do contato.
	 */
	public void cadastraContato(int posicao, String nome, String sobrenome, String telefone) {
		Contato contato = new Contato(nome, sobrenome, telefone);
		listaContatos[posicao - 1] = contato;
	}
	
	/**
	 * Exibe o contato referente a posi��o que o �suario escolher. 
	 * 
	 * @param posicaoContato � a posi��o do contato.
	 */
	public void exibirContato(int posicaoContato) {
		System.out.println(this.listaContatos[posicaoContato - 1].getNome() + " - "
				+ this.listaContatos[posicaoContato - 1].getSobrenome() + " "
				+ this.listaContatos[posicaoContato - 1].getTelefone());
		System.out.println();
	}

	/**
	 * Lista os contatos que foram cadastrados.
	 */
	public void listarContatos() {
		for (int i = 0; i < listaContatos.length; i++) {
			if (this.listaContatos[i] != null) {
				System.out.println(
						(i + 1) + " - " + this.listaContatos[i].getNome() + " " + this.listaContatos[i].getSobrenome());
			}
		}
	}

}
