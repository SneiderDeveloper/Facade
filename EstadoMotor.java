public class EstadoMotor {

    MotorMerlin merlinUno = new MotorMerlin();
    MotorMerlin merlinDos = new MotorMerlin();
    MotorMerlin merlinTres = new MotorMerlin();
    MotorMerlin merlinCuatro = new MotorMerlin();
    MotorMerlin merlinCinco = new MotorMerlin();
    MotorMerlin merlinSeis = new MotorMerlin();
    MotorMerlin merlinSiete = new MotorMerlin();
    MotorMerlin merlinOcho = new MotorMerlin();
    MotorMerlin merlinNueve = new MotorMerlin();
    
    public boolean verificarEstado() {

        boolean ok = false;

        for (int i = 0; i <=8; i++){
            if (merlinUno.temperatura <= 9.0 && merlinUno.temperatura >= 10.0 ) {
                ok = !ok;
            } else {
                System.out.println("Abortar. Fallo en el motor");
            }
            if (merlinUno.presion <= 9.0 && merlinUno.presion >= 10.0 ) {
                System.out.println("Abortar. Fallo en el motor");
            }
        }
        merlinUno.obtenerTemperatura(2.7f);
        merlinUno.obtenerPresion(4.7f);
        System.out.println(merlinUno.temperatura);
        System.out.println(merlinUno.presion);
        return ok;
    }
}