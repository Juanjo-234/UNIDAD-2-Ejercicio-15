public class Paquete {
    String codigo;
    String destino;
    String estado;

    public  Paquete(String codigo, String destino, String estado){
        this.codigo = codigo;
        this.destino = destino;
        this.estado  = estado;
    }

    String getCodigo(){
        return codigo;
    }

    String getDestino(){
        return destino;
    }

    String getEstado(){
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String toString(){
        return "Codigo de paquete: " + codigo + ". Destino del paquete " + destino + ". Estado del paquete: " + estado;
    }



}
