package prueba.crud.Empresa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {
    @Autowired
    private EmpresaRepository empresaRepository;
    
    //Crud
    public Empresa savEmpresa(Empresa entity)
    {
        return empresaRepository.save(entity);
    }
    //Read
    public Empresa findByEmpresa(long id)
    {
        return empresaRepository.findById(id).orElse(null);
    }

    public void deleteById(long id)
    {
        empresaRepository.deleteById(id);
    }

    public List<Empresa> findEmpresas()
    {
        return empresaRepository.findAll();
    }
}
