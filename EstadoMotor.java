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

        boolean listo = false;

        for (int i = 0; i <=8; i++){
            if (merlinUno.temperatura <= 70.1 && merlinUno.temperatura >= 100.0 ) {
                listo = !listo;
            } else {
                System.out.println("Abortar. Fallo en el motor, temperatura alta: " + merlinUno.temperatura);
            }
            if (merlinUno.presion <= 9.0 && merlinUno.presion >= 10.0 ) {
                listo = !listo;
            } else {
            System.out.println("Abortar. Fallo en el motor, presión alta: " + merlinUno.presion);
            }
        }
        merlinUno.obtenerTemperatura(2.7f);
        merlinUno.obtenerPresion(4.7f);
        System.out.println(merlinUno.temperatura);
        System.out.println(merlinUno.presion);
        return listo;
    }
}