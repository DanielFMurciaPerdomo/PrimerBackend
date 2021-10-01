package backend.spring.personaservice;

import java.util.List;

import backend.spring.modelentity.Persona;

//Esta interface tiene todos los metodos que se van a implementar (Hacer practicamente lo de SQL)
public interface IPersonaService {
	public List<Persona> findAll();
	public Persona save(Persona e);
	public void delete(Long id);
	public Persona encontrarporId(Long id);
}