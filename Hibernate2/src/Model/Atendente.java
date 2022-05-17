package Model;

import java.sql.Time;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
@Entity
@Table(name = "Atendente")
public class Atendente {
	@Id
	@OneToOne
	@JoinColumn(name = "identificacao_interna")
	@NotNull
	private Funcionario funcionario;
	
	@Column(name = "horario_entrada", length = 200)
	@NotNull
	  private Time hrEntrada;
	
	@Column(name = "horario_saida")
	@NotNull
	private Time hrSaida;
	
	@Column(name = "email_institucional", length = 80)
	@NotNull
	private String email;
	
	

	@Override
	public String toString() {
		return "Atendente [funcionario=" + funcionario + ", hrEntrada=" + hrEntrada + ", hrSaida=" + hrSaida
				+ ", email=" + email + "]";
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Time getHrEntrada() {
		return hrEntrada;
	}

	public void setHrEntrada(Time hrEntrada) {
		this.hrEntrada = hrEntrada;
	}

	public Time getHrSaida() {
		return hrSaida;
	}

	public void setHrSaida(Time hrSaida) {
		this.hrSaida = hrSaida;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
