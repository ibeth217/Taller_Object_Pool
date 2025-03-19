package co.edu.ucc.ibeth.turismo;
/**
 * Encabezado Personalizado:
 * Autor: Ibeth Pacheco de la Hostia
 * Curso: Patrones de Diseño Orientado a Objetos 
 * Fecha: 18/03/2025
 * Descripción: Clase principal que utiliza el Objectpool
 */
public class Main {
    public static void main(String[] args) {
        PoolVehiculos pool = new PoolVehiculos(2);

        VehiculoTuristico v1 = pool.obtenerVehiculo();
        VehiculoTuristico v2 = pool.obtenerVehiculo();
        VehiculoTuristico v3 = pool.obtenerVehiculo(); // No hay vehículos disponibles

        if (v1 != null) {
            v1.asignarRecorrido("Tour por la ciudad");
            pool.liberarVehiculo(v1);
        }

        VehiculoTuristico v4 = pool.obtenerVehiculo(); // Ahora hay uno disponible
        if (v4 != null) {
            v4.asignarRecorrido("Visita a las montañas");
        }
    }
}