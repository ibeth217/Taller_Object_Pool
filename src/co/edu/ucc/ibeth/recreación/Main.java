package co.edu.ucc.ibeth.recreación;
/**
 * Encabezado Personalizado:
 * Autor: Ibeth Pacheco de la Hostia
 * Curso: Patrones de Diseño Orientado a Objetos 
 * Fecha: 18/03/2025
 * Descripción: Clase principal que utiliza el Objectpool
 */
public class Main {
    public static void main(String[] args) {
        PoolEquiposVR pool = new PoolEquiposVR(3);

        EquipoVR e1 = pool.obtenerEquipo();
        EquipoVR e2 = pool.obtenerEquipo();

        if (e1 != null) {
            e1.asignarUsuario("Carlos");
            pool.liberarEquipo(e1);
        }

        EquipoVR e3 = pool.obtenerEquipo();
        if (e3 != null) {
            e3.asignarUsuario("Ana");
        }
    }
}