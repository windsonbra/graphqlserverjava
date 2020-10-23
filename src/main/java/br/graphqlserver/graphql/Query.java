package br.graphqlserver.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import br.graphqlserver.model.Empregado;
import br.graphqlserver.repository.EmpregadoRepository;
import br.graphqlserver.repository.ProjetoRepository;

public class Query implements GraphQLQueryResolver {

	   private EmpregadoRepository empregadoRepository;
	   private ProjetoRepository projetoRepository;

	   public Query(EmpregadoRepository empregadoRepository, ProjetoRepository projetoRepository) {
	      this.empregadoRepository = empregadoRepository;
	      this.projetoRepository = projetoRepository;
	   }

	   public List<Empregado> obterEmpregados() {
	      return empregadoRepository.findAll();
	   }

	   public long contarEmpregados() {
	      return empregadoRepository.count();
	   }

	   public Empregado obterEmpregadoPorId(Long id) {
	      return empregadoRepository.findById(id).orElseThrow(null);
	   }

	}
