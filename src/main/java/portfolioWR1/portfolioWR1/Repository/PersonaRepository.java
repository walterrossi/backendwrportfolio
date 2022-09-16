
package portfolioWR1.portfolioWR1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolioWR1.portfolioWR1.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{
    
    
}
