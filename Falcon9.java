public class Falcon9 {
    public MotorMerlin motorMerlin;
    public Combustible combustible;
    public Posicion posicion;

    public Falcon9(MotorMerlin motorMerlin, Combustible combustible, Posicion posicion){
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
}