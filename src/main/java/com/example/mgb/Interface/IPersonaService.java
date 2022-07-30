/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.mgb.Interface;

import com.example.mgb.Entity.Persona;
import java.util.List;

/**
 *
 * @author Duderino
 */
public interface IPersonaService {
    //traer una lista de personas
   public List<Persona> getPersona();
// guardar un objeto de tipo Persona   
   public void savePersona(Persona persona);
   //Eliminar  un objeto pero lo buscamos por ID
   public void deletePersona(Long id);
   //buscar una persona por ID
   public Persona findPersona(Long id);
   
   
}
