package br.graphqlserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.graphqlserver.graphql.Mutation;
import br.graphqlserver.graphql.Query;
import br.graphqlserver.repository.EmpregadoRepository;
import br.graphqlserver.repository.ProjetoRepository;

@SpringBootApplication
public class GraphQLServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphQLServerApplication.class, args);
	}

	   @Bean
	   public Query query(EmpregadoRepository empregadoRepository, ProjetoRepository projetoRepository) {
	      return new Query(empregadoRepository, projetoRepository);
	   }

	   @Bean
	   public Mutation mutation(EmpregadoRepository empregadoRepository, ProjetoRepository projetoRepository) {
	      return new Mutation(empregadoRepository, projetoRepository);
	   }
}
