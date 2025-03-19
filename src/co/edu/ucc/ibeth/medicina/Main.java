package co.edu.ucc.ibeth.medicina;
/**
 * Encabezado Personalizado:
 * Autor: Ibeth Pacheco de la Hostia
 * Curso: Patrones de Diseño Orientado a Objetos 
 * Fecha: 18/03/2025
 * Descripción: Clase principal que utiliza el Objectpool
 */
public class Main {
    public static void main(String[] args) {
        PoolCamillas pool = new PoolCamillas(3);

        Camilla c1 = pool.obtenerCamilla();
        Camilla c2 = pool.obtenerCamilla();

        if (c1 != null) {
            c1.asignarPaciente("María");
            pool.liberarCamilla(c1);
        }

        Camilla c3 = pool.obtenerCamilla();
        if (c3 != null) {
            c3.asignarPaciente("Pedro");
        }
    }
}
