
package portfolioWR1.portfolioWR1.Service;

import java.io.Serializable;
import java.util.List;
import javax.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;
import portfolioWR1.portfolioWR1.model.Persona;


public interface IPersonaService {
    public List <Persona> verPersonas();
    public void crearPersona (Persona per);
    public void borrarPersona (Long id);
    public Persona buscarPersona (Long id);      
    public void modificarPersona (Persona per);

    public Persona findById(Long id);

    public Persona save(Persona PersonaActual);

   
    
}
