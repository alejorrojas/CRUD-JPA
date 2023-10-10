

package persistance;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logic.Alumno;
import logic.Carrera;
import logic.Materia;
import persistance.exceptions.NonexistentEntityException;


public class PersistenceController {
    AlumnoJpaController alumnoController = new AlumnoJpaController();
    CarreraJpaController carreraController = new CarreraJpaController();
    MateriaJpaController materiaController = new MateriaJpaController();
    
    //Alumno
    public void crearAlumno(Alumno newAlumno) {
        alumnoController.create(newAlumno);
    }

    public void eliminarAlumno(int id) {
        try {
            alumnoController.destroy(id);
        } catch (persistance.exceptions.NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alumno) {
        try {
            alumnoController.edit(alumno);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
       return alumnoController.findAlumno(id);
    }

    public ArrayList<Alumno> traerAlumnos() {
        
        List<Alumno> list = alumnoController.findAlumnoEntities();
        ArrayList<Alumno> listAlumnos = new ArrayList<Alumno>(list);
        
        return listAlumnos;
    
    }
    
    //Carrera
    public void crearCarrera(Carrera newAlumno) {
        carreraController.create(newAlumno);
    }

    public void eliminarCarrera(int id) {
        try {
            carreraController.destroy(id);
        } catch (persistance.exceptions.NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCarrera(Carrera alumno) {
        try {
            carreraController.edit(alumno);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Carrera traerCarrera(int id) {
    
       return carreraController.findCarrera(id);
    }

    public ArrayList<Carrera> traerCarreras() {
        
        List<Carrera> listCarreras = carreraController.findCarreraEntities();
        ArrayList<Carrera> arrayCarreras = new ArrayList<Carrera>(listCarreras);
        
        return arrayCarreras;
    
    }

    //Materias
    public void crearMateria(Materia newMateria) {
        materiaController.create(newMateria);
    }

    public void eliminarMateria(int id) {
        try {
            materiaController.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarMateria(Materia materia) {
        try {
            materiaController.edit(materia);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia traerMateria(int id) {
        return materiaController.findMateria(id);
    }

    public ArrayList<Materia> traerMaterias() {
        List<Materia> listMaterias = materiaController.findMateriaEntities();
        ArrayList<Materia> arrayMaterias = new ArrayList<Carrera>(listMaterias);
        
        return arrayMaterias;
    }
    
}
