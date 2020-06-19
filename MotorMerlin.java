
public class MotorMerlin {

    public float temperatura;
    public float presion;

    //Camara de combustión
    public float obtenerTemperatura(float datosSensorTemperatura) {
        this.temperatura = datosSensorTemperatura;
        return temperatura;
    }

    public float obtenerPresion(float datosSensorPresion) {
        this.presion = datosSensorPresion;
        return presion;
    }

    
    
}