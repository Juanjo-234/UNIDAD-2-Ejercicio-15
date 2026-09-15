//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
CentroLogistico centro = new CentroLogistico("Centro Metropolitano");

    CamionDeReparto camion1 = new CamionDeReparto("AB-123-CD");
    CamionDeReparto camion2 = new CamionDeReparto("EF-456-GH");

    centro.registrarCamion(camion1);
    centro.registrarCamion(camion2);

    Paquete p1 = new Paquete("PKG-001", "Mendoza", "En Depósito");
    Paquete p2 = new Paquete("PKG-002", "Córdoba", "En Depósito");
    Paquete p3 = new Paquete("PKG-003", "Buenos Aires", "En Depósito");


    System.out.println("\n--- ASIGNACIÓN DE PAQUETES A CAMIONES ---");
    camion1.asignarPaquete(p1);
    camion1.asignarPaquete(p2);
    camion2.asignarPaquete(p3);

    System.out.println("\n--- SIMULACIÓN DE ACTUALIZACIÓN DE ESTADOS ---");

    centro.difundirOrdenActualizacion("PKG-001", "En Tránsito");

    System.out.println();

    centro.difundirOrdenActualizacion("PKG-003", "Entregado");

    System.out.println();

    centro.difundirOrdenActualizacion("PKG-999", "En Tránsito");
}
