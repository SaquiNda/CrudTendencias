package prueba.crud.Usuario;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService 
{
    @Autowired
    private UsuarioRepository usuarioRepository;

    //Crud
    //Create
    public Usuario save(Usuario entity)
    {
        return usuarioRepository.save(entity);
    }
    //Read
    public Usuario findById(long id)
    {
        return usuarioRepository.findById(id).orElse(null);
    }
    //Select all
    public List<Usuario> findAll()
    {
        return usuarioRepository.findAll();
    }

    public void deleteById(long id)
    {
        usuarioRepository.deleteById(id);
    }
}
