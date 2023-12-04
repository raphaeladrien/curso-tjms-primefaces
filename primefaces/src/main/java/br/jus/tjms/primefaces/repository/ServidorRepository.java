package br.jus.tjms.primefaces.repository;

import br.jus.tjms.primefaces.entidade.Servidor;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ServidorRepository extends CrudRepository<Servidor, UUID> {
}
