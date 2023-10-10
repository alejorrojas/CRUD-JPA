

package code.proyectjpa;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import logic.Alumno;
import logic.Carrera;
import logic.Controller;
import logic.Materia;


public class Main {

    public static void main(String[] args) {
        System.out.println("Init persistance");
        
        Controller controller = new Controller();
        
        //Se crea la carrera y agrega a la DB
        LinkedList<Materia> listaMaterias = new LinkedList();
        Carrera carreraISI = new Carrera(1, "Ing. en Software", listaMaterias);
        controller.crearCarrera(carreraISI);    
        
        //Se crean las materias y agrega a la DB
        Materia materiaSintaxis = new Materia(1, "Sintaxis", "Cuatri", carreraISI);
        Materia materiaADS = new Materia(2, "ADS", "Anual", carreraISI);
        Materia materiaAMII = new Materia(3, "AM II", "Anual", carreraISI);
        Materia materiaParadigmas = new Materia(4, "Paradigmas", "Cuatri", carreraISI);
        controller.crearMateria(materiaADS);
        controller.crearMateria(materiaAMII);
        controller.crearMateria(materiaSintaxis);
        controller.crearMateria(materiaParadigmas);
        
        /*
        //Se agregan las materias a la lista de Materias
        listaMaterias.add(materiaSintaxis);
        listaMaterias.add(materiaADS);
        listaMaterias.add(materiaAMII);
        listaMaterias.add(materiaParadigmas);
       
        //Se agrega la lista de materias creadas a la clase y a la DB
        carreraISI.setListaMaterias(listaMaterias);
        controller.editarCarrera(carreraISI);

        Alumno newAlumno = new Alumno(5, "Ivan", "Rojas", new Date(), carreraISI);
        controller.crearAlumno(newAlumno);

        Alumno alumno = controller.traerAlumno(5);

         System.out.println( alumno.toString() + alumno.getCarrera().getNombre());
         */
    }
}
