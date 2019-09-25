package lab3;

/**
 * Representação do Contato, que tem posição, nome, sobrenome e telefone.
 * 
 * @author Gabriel Menezes Cabral
 *
 */
public class Contato {

	/**
	 * É o nome do contato.
	 */
	private String nome;
	
	/**
	É o sobrenome do contato.
	 */
	private String sobrenome;
	
	/**
	 * É o telefone do contato.
	 */
	private String telefone;
	
	/**
	 * É o construtor, responsável por construir o contato.
	 * 
	 * @param nome É o nome do contato.
	 * @param sobrenome É o sobrenome do contato.
	 * @param telefone É o telefone do contato.

	 */
	public Contato(String nome, String sobrenome, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}

	/**
	 * Método que retorna o nome.
	 * 
	 * @return o nome do contato.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Método que muda o nome do contato.
	 * 
	 * @param nome O nome do contato.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Método que retorna o sobrenome do contato.
	 * 
	 * @return O sobrenome do contato.
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * Método que rmuda o sobrenome do contato.
	 * 
	 * @param sobrenome O sobrenome do contato.
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	/**
	 * Método que retorna o telefone do contato.
	 * 
	 * @return O telefone do contato.
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * Método que muda o telefone do contato.
	 * 
	 * @param telefone O telefone do contato.
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}