public class Facade {

    Combustible combustible = new Combustible();
    EstadoMotor estadoMotor = new EstadoMotor();
    Posicion posicion = new Posicion();
    Falcon9 falconNine = new Falcon9(combustible, posicion, estadoMotor);
    
    boolean combustibleListo = falconNine.gCombustible().verificarEstadoCombustible();
    boolean motorListo = falconNine.gEstadoMotor().verificarEstado();
    boolean posicionCorrecta = falconNine.gPosicion().verificarInclinacion();

    public void estadoFalconNine() {
        if (combustibleListo && motorListo && posicionCorrecta) {
            despegar();
        } else {
            abortar();
        }
    }

    public void despegar() {
        System.out.println("Motores y combustible listos para el despegue.");
    }

    public void abortar() {
        System.out.println("Estado combustible: " + combustibleListo);
        System.out.println("Estado motores: " + motorListo);
        System.out.println("Estado posición: " + posicionCorrecta);
    }
    

}