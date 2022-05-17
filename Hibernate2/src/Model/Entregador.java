package Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Entregador")
public class Entregador  {
	
	@Id
	@OneToOne
	@JoinColumn(name = "identificacao_interna")
	@NotNull
	private Funcionario funcionario;
	
	@Column(name = "numero_cnh", length = 50)
	@NotNull
	  private String numero;
	
	@Column(name = "categoria_cnh", length = 5)
	@NotNull
	private String categoria;
	
	
	@Override
	public String toString() {
		return "Entregador [funcionario=" + funcionario + ", numero=" + numero + ", categoria=" + categoria + "]";
	}
	

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	

}
