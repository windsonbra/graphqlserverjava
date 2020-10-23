package br.graphqlserver.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Empregado {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nome;

	private Integer idade;

	private Date nascimento;

	@OneToMany(mappedBy = "empregado", fetch = FetchType.EAGER)
	private List<Projeto> projetos;
	
	public Empregado() {

	}

	public Empregado(String nome,Integer idade, Date nascimento) {
		super();
		this.idade = idade;
		this.nome = nome;
		this.nascimento = nascimento;
	}

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

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public List<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}

}