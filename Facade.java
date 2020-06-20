public class Facade {

    Combustible combustible = new Combustible();
    EstadoMotor estadoMotor = new EstadoMotor();
    Posicion posicion = new Posicion();
    Falcon9 falconNine = new Falcon9(combustible, posicion, estadoMotor);
    

    public void listo() {
        falconNine.gCombustible().obtenerQueroseno(100.0);
        falconNine.gCombustible().obtenerOxidante(100.0);
        boolean combustibleListo = falconNine.gCombustible().verificarEstadoCombustible();
        System.out.println("Estado combustible: " + combustibleListo);
       
        boolean motorListo = falconNine.gEstadoMotor().verificarEstado();
        System.out.println("Estado motores: " + motorListo);

        falconNine.gPosicion().obtenerGravitacion(0.0);
        boolean posicionCorrecta = falconNine.gPosicion().verificarInclinacion();
        System.out.println("Estado posición: " + posicionCorrecta);
    }

    public void abortar() {
        
    }
    

}