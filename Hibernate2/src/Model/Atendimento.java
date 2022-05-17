package Model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
@Entity
@Table(name = "Atendimento")
public class Atendimento {
	@Id
	@ManyToOne
	@JoinColumn(name = "identificacao_interna")
	@NotNull
	  private Atendente atendente;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "cpf_cliente")
	@NotNull
	  private Cliente cliente;
	
	@Id
	@Column(name = "data_hr_atendimento")
	@Null
	private LocalDateTime data;
	
	@Column(name = "observacao", length = 250)
	@NotNull
	private String observacao;
	

	@Override
	public String toString() {
		return "Atendimento [atendente=" + atendente + ", cliente=" + cliente + ", data=" + data + "]";
	}

	public Atendente getAtendente() {
		return atendente;
	}

	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	
}
