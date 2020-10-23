package br.graphqlserver.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Projeto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nome;

	@Column(name = "codigo_servico", nullable = false)
	private Integer codigoServico;

	private String responsavel;

	private Date prazo;

	@ManyToOne
	@JoinColumn(name = "empregado_id", nullable = false, updatable = false)
	private Empregado empregado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigoServico() {
		return codigoServico;
	}

	public void setCodigoServico(Integer codigoServico) {
		this.codigoServico = codigoServico;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public Date getPrazo() {
		return prazo;
	}

	public void setPrazo(Date prazo) {
		this.prazo = prazo;
	}

	public Empregado getEmpregado() {
		return empregado;
	}

	public void setEmpregado(Empregado empregado) {
		this.empregado = empregado;
	}

}