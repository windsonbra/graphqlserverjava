package br.graphqlserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.graphqlserver.model.Projeto;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long> {

}