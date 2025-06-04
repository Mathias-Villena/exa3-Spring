package pe.edu.tecsup.examen3javaspring.domain.persistence;

import pe.edu.tecsup.examen3javaspring.domain.entities.Curso;
import org.springframework.data.repository.CrudRepository;
public interface CursoDao extends CrudRepository<Curso, Integer> {
}
