package prueba.crud.Usuario;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

//Representa el repositorio, es una interface
public interface UsuarioRepository extends CrudRepository <Usuario, Long>
{
    List<Usuario> findAll();
}
