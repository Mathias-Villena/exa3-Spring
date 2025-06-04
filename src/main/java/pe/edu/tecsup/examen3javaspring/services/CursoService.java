package pe.edu.tecsup.examen3javaspring.services;
import pe.edu.tecsup.examen3javaspring.domain.entities.Curso;
import java.util.List;
public interface CursoService {
    public void grabar(Curso curso);
    public void eliminar(int id);
    public Curso buscar(Integer id);
    public List<Curso> listar();
}
