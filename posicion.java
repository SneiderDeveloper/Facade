public class Posicion {

    public float inclinacionGrados;
    
    public void obtenerGravitacion(float datosSensorGravitacional) {
        this.inclinacionGrados = datosSensorGravitacional;
    }

    public boolean verificarInclinacion() {
        boolean listo = false;
        if (inclinacionGrados == 0) {
            listo = !listo;
        } else {
            System.out.println("Cochete "  + inclinacionGrados + 
            "grados inclinado. Se necesita una verticalización completa");
        }
        return listo;
    }
    
}