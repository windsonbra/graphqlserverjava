package br.graphqlserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.graphqlserver.model.Empregado;

@Repository
public interface EmpregadoRepository extends JpaRepository<Empregado, Long> {

}