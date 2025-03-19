package co.edu.ucc.ibeth.medicina;

import java.util.Queue;
import java.util.LinkedList;

public class Camilla {
	
	    private String id;

	    public Camilla(String id) {
	        this.id = id;
	        System.out.println("Nueva camilla disponible: " + id);
	    }

	    public void asignarPaciente(String paciente) {
	        System.out.println("Camilla " + id + " asignada a paciente " + paciente);
	    }
}
