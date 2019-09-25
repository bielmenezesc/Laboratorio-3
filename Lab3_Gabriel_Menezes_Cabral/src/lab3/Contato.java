package lab3;

/**
 * Representa��o do Contato, que tem posi��o, nome, sobrenome e telefone.
 * 
 * @author Gabriel Menezes Cabral
 *
 */
public class Contato {

	/**
	 * � o nome do contato.
	 */
	private String nome;
	
	/**
	� o sobrenome do contato.
	 */
	private String sobrenome;
	
	/**
	 * � o telefone do contato.
	 */
	private String telefone;
	
	/**
	 * � o construtor, respons�vel por construir o contato.
	 * 
	 * @param nome � o nome do contato.
	 * @param sobrenome � o sobrenome do contato.
	 * @param telefone � o telefone do contato.

	 */
	public Contato(String nome, String sobrenome, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}

	/**
	 * M�todo que retorna o nome.
	 * 
	 * @return o nome do contato.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * M�todo que muda o nome do contato.
	 * 
	 * @param nome O nome do contato.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * M�todo que retorna o sobrenome do contato.
	 * 
	 * @return O sobrenome do contato.
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * M�todo que rmuda o sobrenome do contato.
	 * 
	 * @param sobrenome O sobrenome do contato.
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	/**
	 * M�todo que retorna o telefone do contato.
	 * 
	 * @return O telefone do contato.
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * M�todo que muda o telefone do contato.
	 * 
	 * @param telefone O telefone do contato.
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}