package prueba.crud.Usuario;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //actua como rest (get, post, put, delete) peticiones http
@RequestMapping("api/admin")
@CrossOrigin({"*"})
public class UsuarioController 
{
    //Insertar los servicios
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/")
    public Usuario save(@RequestBody Usuario entity)
    {
        return usuarioService.save(entity);
    }
    //Para el metodo red
    @GetMapping("/")
    public List<Usuario> findAll()
    {
        return usuarioService.findAll();
    }
    //Para el update
    @PutMapping("/{id}/")
    public Usuario update(@RequestBody Usuario entity)
    {
        return usuarioService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id)
    {
        usuarioService.deleteById(id);
    }
}
