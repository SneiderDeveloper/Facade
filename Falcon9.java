public class Falcon9 {

    public MotorMerlin motorMerlin;
    public Combustible combustible;
    public Posicion posicion;
    public EstadoMotor estadoMotor;

    public Falcon9(MotorMerlin motorMerlin, 
                    Combustible combustible, 
                    Posicion posicion, 
                    EstadoMotor estadoMotor){

        this.motorMerlin = motorMerlin;
        this.combustible = combustible;
        this.posicion = posicion;
    }

    public MotorMerlin gMotorMerlin() {
        return motorMerlin;
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