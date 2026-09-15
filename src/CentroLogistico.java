import java.util.ArrayList;
import java.util.List;

public class CentroLogistico {
    private String nombre;
    private List<CamionDeReparto> camiones;

    public CentroLogistico(String nombre) {
        this.nombre = nombre;
        this.camiones = new ArrayList<>();
    }

    public void registrarCamion(CamionDeReparto camion) {
        camiones.add(camion);
        System.out.println("[CENTRO LOGÍSTICO " + nombre + "] Camion" + camion.patente + " registrado en la flota.");
    }

    public void difundirOrdenActualizacion(String codigoPaquete, String nuevoEstado) {
        System.out.println("\n[CENTRO LOGÍSTICO " + nombre + "] Difundiendo orden de actualización de ruta/estado para el paquete: " + codigoPaquete);

        boolean encontradoEnFlota = false;
        for (CamionDeReparto camion : camiones) {
            for (Paquete p : camion.getPaquetesAsignados()) {
                if (p.getCodigo().equalsIgnoreCase(codigoPaquete)) {
                    encontradoEnFlota = true;
                    break;
                }
            }
            camion.actualizarEstadoPaquete(codigoPaquete, nuevoEstado);
        }

        if (!encontradoEnFlota) {
            System.out.println("[CENTRO LOGÍSTICO] Aviso: El paquete " + codigoPaquete + " no fue localizado en ningún camión activo de la flota.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public List<CamionDeReparto> getCamiones() {
        return camiones;
    }

    @Override
    public String toString() {
        return "CentroLogistico [Nombre: " + nombre + ", Camiones en flota: " + camiones.size() + "]";
    }
}