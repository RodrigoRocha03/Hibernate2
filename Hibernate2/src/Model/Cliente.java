package Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
@Entity
@Table(name = "Cliente")
public class Cliente {
	
	@Id
	@Column(name = "cpf_cliente", length = 13)
	@NotNull
	private String cpf;
	
	@Column(name = "nome_cliente", length = 200)
	@NotNull
	  private String nome;
	
	@Column(name = "contato_celular", length = 13)
	@NotNull
	private String celular;

	@Column(name = "email", length = 80)
	@NotNull
	private String email;
	
	@Column(name = "pronome_tratamento", length = 80)
	@NotNull
	private String pTratamento;

	
	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", celular=" + celular + ", email=" + email + ", pTratamento="
				+ pTratamento + "]";
	}
	

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getpTratamento() {
		return pTratamento;
	}

	public void setpTratamento(String pTratamento) {
		this.pTratamento = pTratamento;
	}
	
	
}
