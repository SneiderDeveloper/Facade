public class Posicion {

    public Double inclinacionGrados;
    
    public void obtenerGravitacion(Double datosSensorGravitacional) {
        this.inclinacionGrados = datosSensorGravitacional;
    }

    public boolean verificarInclinacion() {
        obtenerGravitacion(0.0);
        boolean listo = false;
        if (inclinacionGrados == 0.0) {
            listo = !listo;
        } else {
            System.out.println("Cochete "  + inclinacionGrados + 
            "grados inclinado. Se necesita una verticalización completa");
        }
        return listo;
    }
    
}