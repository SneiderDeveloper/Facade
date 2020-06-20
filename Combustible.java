public class Combustible {

    public Double queroseno;
    public Double oxigeno;
    
    public void obtenerQueroseno(Double nivelQueroseno) {
        this.queroseno = nivelQueroseno;
    }

    public void obtenerOxidante(Double nivelOxigenoLiquido) {
        this.oxigeno = nivelOxigenoLiquido;
    }

    public boolean verificarEstadoCombustible() {
        obtenerQueroseno(100.0);
        obtenerOxidante(100.0);
        boolean listo = false;
        if ((queroseno == 100.0) && (oxigeno == 100.0)){
            listo = !listo;
        } else {
            System.out.println("Tanque de queroseno en: " + queroseno);
            System.out.println("Tanque de oxigeno en: " + oxigeno);
        }
        return listo;
    }
}