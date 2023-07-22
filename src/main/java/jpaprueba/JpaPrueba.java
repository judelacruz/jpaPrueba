package jpaprueba;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import jpaprueba.logic.Alumno;
import jpaprueba.logic.Carrera;
import jpaprueba.logic.Controladora;
import jpaprueba.logic.Materia;
//import jpaprueba.persistencia.ControladoraPersistencia;

public class JpaPrueba {

    public static void main(String[] args) {
        
    Controladora control = new Controladora();
    
    LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
    
    Carrera carre = new Carrera(1, "SISTEMA", listaMaterias);
    
    //Creación de Materia
    Materia mate1 = new Materia(99, "Programacion LOGICA", "Primer semestre", carre);
    Materia mate2 = new Materia(98, "Programacion PYTHON ", "Segundo semestre", carre);
    Materia mate3 = new Materia(97, "Programacion OPP", "Tercer semestre", carre);
    
//Guardamos Materia en la BD
   
    control.crearMateria(mate1);
    control.crearMateria(mate2);
    control.crearMateria(mate3);

//Creamos lista de materias y las agregamos
    
    listaMaterias.add(mate1);
    listaMaterias.add(mate2);
    listaMaterias.add(mate3);
    
    carre.setListaMaterias(listaMaterias);
    control.editarCarrera(carre);
    
//Creación Carrera con lista de materias
    
    
    
//Guardado Carrera en BD
    
    control.crearCarrera(carre);
    
//CReación Alumno (con carrera)
    
    Alumno alu = new Alumno(10, "Marcia", "Alejandra", new Date(),carre);
    
//Guardamos el Alumno en la BD
        
    control.crearAlumno(alu);
    
    System.out.println("---------------------");
    System.out.println("------Datos Alumnos");
    Alumno al = control.traerAlumno(10);
    System.out.println("Alumno " +al.getNombre() + " " + al.getApellido());
    System.out.println("Curso la carrera de: " + al.getCarre().getNombre());
 
    
    }
}
    

