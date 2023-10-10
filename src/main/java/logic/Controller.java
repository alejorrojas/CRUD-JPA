

package logic;

import java.util.ArrayList;
import persistance.PersistenceController;


public class Controller {

    PersistenceController persistenceController = new PersistenceController();

    //Alumno
    public void crearAlumno(Alumno newAlumno){
        persistenceController.crearAlumno(newAlumno);
    }
    
    public void eliminarAlumno(int id){
        persistenceController.eliminarAlumno(id);
       
    }
    
    public void editarAlumno(Alumno alumno){
        persistenceController.editarAlumno(alumno);
    }
    
    public Alumno traerAlumno(int id){
       return persistenceController.traerAlumno(id);
    }
    
    public ArrayList<Alumno> traerAlumnos(){
       return persistenceController.traerAlumnos();
    }
    
    //Carrera
     public void crearCarrera(Carrera newCarrera){
        persistenceController.crearCarrera(newCarrera);
    }
    
    public void eliminarCarrera(int id){
        persistenceController.eliminarCarrera(id);
    }
    
    public void editarCarrera(Carrera carrera){
        persistenceController.editarCarrera(carrera);
    }
    
    public Carrera traerCarrera(int id){
       return persistenceController.traerCarrera(id);
    }
    
    public ArrayList<Carrera> traerCarreras(){
       return persistenceController.traerCarreras();
    }
    
   
    //Materia
    public void crearMateria(Materia newMateria){
        persistenceController.crearMateria(newMateria);
    }
    
    public void eliminarMateria(int id){
        persistenceController.eliminarMateria(id);
    }
    
    public void editarCarrera(Materia materia){
        persistenceController.editarMateria(materia);
    }
    
    public Materia traerMateria(int id){
       return persistenceController.traerMateria(id);
    }
    
    public ArrayList<Materia> traerMaterias(){
       return persistenceController.traerMaterias();
    }
}
