
package portfolioWR1.portfolioWR1.Service;

import java.io.Serializable;
import java.util.List;
import javax.persistence.metamodel.SingularAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.stereotype.Service;
import portfolioWR1.portfolioWR1.Repository.PersonaRepository;
import portfolioWR1.portfolioWR1.model.Persona;

@Service

public class PersonaService implements IPersonaService{

    @Autowired
    public PersonaRepository persoRepo;
    
    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

      
    
    @Override
    public void crearPersona(Persona per) {
         persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
     Persona per=persoRepo.findById(id).orElse(null);
     return per;
     
    }

    @Override
    public void modificarPersona(Persona per) {
        persoRepo.save(per);
    }
    
    
    
    

    @Override
    public Persona findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Persona save(Persona PersonaActual) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
