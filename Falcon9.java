public class Falcon9 {

    private Combustible combustible;
    private Posicion posicion;
    private EstadoMotor estadoMotor;

    public Falcon9( 
                    Combustible combustible, 
                    Posicion posicion, 
                    EstadoMotor estadoMotor
                    ){

        this.combustible = combustible;
        this.estadoMotor = estadoMotor;
        this.posicion = posicion;
    }

    public Combustible gCombustible() {
        return combustible;
    }

    public Posicion gPosicion() {
        return posicion;
    }

    public EstadoMotor gEstadoMotor() {
        return estadoMotor;
    }
}