package backend.spring.modelsDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.spring.modelentity.Persona;

//Hace que todo funcione, ya que lee con el JpaRepository la clase y el tipo de la llave primaria
//Crea las consultas y hace todo
public interface IPersonaDAO extends JpaRepository<Persona, Long> {

}