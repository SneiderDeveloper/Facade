public class EstadoMotor {

    // MotorMerlin objetos[] = new MotorMerlin[8];

    MotorMerlin merlinUno = new MotorMerlin();
    MotorMerlin merlinDos = new MotorMerlin();
    MotorMerlin merlinTres = new MotorMerlin();
    MotorMerlin merlinCuatro = new MotorMerlin();
    MotorMerlin merlinCinco = new MotorMerlin();
    MotorMerlin merlinSeis = new MotorMerlin();
    MotorMerlin merlinSiete = new MotorMerlin();
    MotorMerlin merlinOcho = new MotorMerlin();
    MotorMerlin merlinNueve = new MotorMerlin();

    MotorMerlin objetos[] = {
        merlinUno,
        merlinDos,
        merlinTres,
        merlinCuatro,
        merlinCinco,
        merlinSeis,
        merlinSiete,
        merlinOcho,
        merlinNueve
};
    
    public boolean verificarEstado() {

        merlinUno.obtenerTemperatura(70.7);
        merlinUno.obtenerPresion(9.7);

        merlinDos.obtenerTemperatura(70.7);
        merlinDos.obtenerPresion(9.7);

        merlinTres.obtenerTemperatura(70.7);
        merlinTres.obtenerPresion(9.7);

        merlinCuatro.obtenerTemperatura(70.7);
        merlinCuatro.obtenerPresion(9.7);

        merlinCinco.obtenerTemperatura(100.0);
        merlinCinco.obtenerPresion(9.7);

        merlinSeis.obtenerTemperatura(70.7);
        merlinSeis.obtenerPresion(9.7);

        merlinSiete.obtenerTemperatura(70.7);
        merlinSiete.obtenerPresion(9.7);

        merlinOcho.obtenerTemperatura(70.7);
        merlinOcho.obtenerPresion(9.7);

        merlinNueve.obtenerTemperatura(70.7);
        merlinNueve.obtenerPresion(9.7);

        boolean listo = false;

        for (int i=0; i<objetos.length; i++) {

            boolean estadoTemperatura = (objetos[i].temperatura >= 70.1) && (objetos[i].temperatura <= 100.0) ? true : false;
            boolean estadoPresicion = (objetos[i].presion >= 9.0) && (objetos[i].presion <= 10.0) ? true : false;

            if (estadoTemperatura && estadoPresicion) {
                listo = !listo;
            } else {
                if (!estadoTemperatura) System.out.println("Abortar. Fallo en el motor " + objetos[i] + ", temperatura fuera de rango: " + objetos[i].temperatura + "°C");
                if (!estadoPresicion) System.out.println("Abortar. Fallo en el motor " + objetos[i] + ", presión fuera de rango: " + objetos[i].presion + "KPa");
            }
        }
        return listo;
    }
}