import java.util.ArrayList;
import java.util.List;
public class CamionDeReparto {
 String patente;
    List<Paquete> paquetesAsignados;

    public CamionDeReparto(String patente) {
        this.patente = patente;
        this.paquetesAsignados = new ArrayList<>();
    }

    public void asignarPaquete(Paquete paquete) {
        paquetesAsignados.add(paquete);
        System.out.println("Paquete " + paquete.getCodigo() + " asignado correctamente a camion " + patente);
    }

    void actualizarEstadoPaquete(String codigoPaquete, String nuevoEstado) {
        boolean encontrado = false;
        for (Paquete paquete : paquetesAsignados) {
            if (paquete.getCodigo().equalsIgnoreCase(codigoPaquete)) {
                paquete.setEstado(nuevoEstado);
                System.out.println("Estado del paquete " + codigoPaquete + " actualizado a: " + nuevoEstado);
                encontrado = true;
                break;
            }
        }


    }

    String getPatente(){
        return patente;
    }

    public List<Paquete> getPaquetesAsignados() {
        return paquetesAsignados;
    }
}
