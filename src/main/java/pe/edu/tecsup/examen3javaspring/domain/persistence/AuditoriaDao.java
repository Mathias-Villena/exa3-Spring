package pe.edu.tecsup.examen3javaspring.domain.persistence;

import pe.edu.tecsup.examen3javaspring.domain.entities.Auditoria;
import org.springframework.data.repository.CrudRepository;


public interface AuditoriaDao extends CrudRepository<Auditoria, Integer> {

}