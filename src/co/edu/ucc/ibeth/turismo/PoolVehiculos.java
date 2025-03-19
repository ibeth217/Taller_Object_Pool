package co.edu.ucc.ibeth.turismo;

import java.util.Queue;
import java.util.LinkedList;

public class PoolVehiculos {
    private Queue<VehiculoTuristico> pool;
    private int limite;

    public PoolVehiculos(int limite) {
        this.limite = limite;
        this.pool = new LinkedList<>();
        for (int i = 0; i < limite; i++) {
            pool.add(new VehiculoTuristico("Vehiculo-" + (i + 1)));
        }
    }

    public VehiculoTuristico obtenerVehiculo() {
        if (!pool.isEmpty()) {
            return pool.poll();
        } else {
            System.out.println("No hay vehículos disponibles, espere...");
            return null;
        }
    }
    
    public void liberarVehiculo(VehiculoTuristico vehiculo) {
        pool.offer(vehiculo);
    }
}
