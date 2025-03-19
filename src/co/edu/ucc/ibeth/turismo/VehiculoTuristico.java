package co.edu.ucc.ibeth.turismo;

import java.util.Queue;
import java.util.LinkedList;

class VehiculoTuristico {
    private String id;

    public VehiculoTuristico(String id) {
        this.id = id;
        System.out.println("Nuevo vehículo disponible: " + id);
    }

    public void asignarRecorrido(String recorrido) {
        System.out.println("Vehículo " + id + " asignado a " + recorrido);
    }
}