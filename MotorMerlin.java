
public class MotorMerlin {

    public Double temperatura;
    public Double presion;

    //Camara de combustión
    public Double obtenerTemperatura(Double datosSensorTemperatura) {
        this.temperatura = datosSensorTemperatura;
        return temperatura;
    }

    public Double obtenerPresion(Double datosSensorPresion) {
        this.presion = datosSensorPresion;
        return presion;
    }


    
}