
package com.example.mgb.Service;

import com.example.mgb.Entity.Persona;
import com.example.mgb.Interface.IPersonaService;
import com.example.mgb.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 *
 * @author Duderino
 */

public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;
    
    
    /**
     *
     * @return
     */
    @Override
    public List<Persona> getPersona() {
        
         List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
       ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
     ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
      Persona persona= (Persona) ipersonaRepository.findById(id).orElse(null);
              return persona;
    }
    
}
