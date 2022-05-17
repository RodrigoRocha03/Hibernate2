package Model;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Funcionario")
public class Funcionario {
	
	
	@Id
	@Column(name = "identificacao_interna")
	@NotNull
	  private int Iinterna;
	
	
	@Column(name = "nome_funcionario", length = 200)
	@NotNull
	  private String nome;
	
	@Column(name = "data_nascimento")
	@NotNull
	private LocalDate data;
	
	@Column(name = "contato_celular", length = 13)
	@NotNull
	private String celular;
	
	
	@Override
	public String toString() {
		return "Funcionario [Iinterna=" + Iinterna + ", nome=" + nome + ", data=" + data + ", celular=" + celular + "]";
	}
	

	public int getIinterna() {
		return Iinterna;
	}

	public void setIinterna(int iinterna) {
		Iinterna = iinterna;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	
	
	
}
