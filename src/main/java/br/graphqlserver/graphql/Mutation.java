package br.graphqlserver.graphql;

import java.util.Date;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import br.graphqlserver.model.Empregado;
import br.graphqlserver.repository.EmpregadoRepository;
import br.graphqlserver.repository.ProjetoRepository;

public class Mutation implements GraphQLMutationResolver {

	   private EmpregadoRepository empregadoRepository;
	   private ProjetoRepository projetoRepository;

	   public Mutation(EmpregadoRepository empregadoRepository, ProjetoRepository projetoRepository) {
	      this.empregadoRepository = empregadoRepository;
	      this.projetoRepository = projetoRepository;
	   }

	   public Empregado novoEmpregado(String nome, Integer idade) {
	      Empregado empregado = new Empregado(nome, idade, new Date());
	      empregadoRepository.save(empregado);
	      return empregado;
	   }

	   public boolean deletarEmpregado(Long id) {
	      empregadoRepository.deleteById(id);
	      return true;
	   }

	}
