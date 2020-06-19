public class EstadoMotor {
    
    public void verificarEstado() {
        MotorMerlin merlinUno = new MotorMerlin();
        merlinUno.obtenerTemperatura(2.7f);
        merlinUno.obtenerPresion(4.7f);
        System.out.println(merlinUno.temperatura);
        System.out.println(merlinUno.presion);
    }
}