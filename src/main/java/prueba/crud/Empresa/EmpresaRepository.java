package prueba.crud.Empresa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface EmpresaRepository extends CrudRepository <Empresa, Long>
{
    List<Empresa> findAll();
}
