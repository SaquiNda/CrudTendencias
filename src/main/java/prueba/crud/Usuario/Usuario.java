package prueba.crud.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import prueba.crud.Empresa.Empresa;

@Data
@Entity
public class Usuario 
{
    @Id // para identificar el id de la tabla en la base de datos
    //para generar un auto id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String descripcion;
    //Thunder cliente
    @ManyToOne
    private Empresa empresa;
}
