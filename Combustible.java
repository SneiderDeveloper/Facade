public class Combustible {

    public float queroseno;
    public float oxigeno;
    
    public void verificarQueroseno(float nivelQueroseno) {
        this.queroseno = nivelQueroseno;
    }

    public void verificarOxigenoLiquido(float nivelOxigenoLiquido) {
        this.oxigeno = nivelOxigenoLiquido;
    }

    public boolean verificarEstadoCombustible() {
        boolean listo = false;
        if (queroseno == 100.0){
            listo = !listo;
        } else {
            System.out.println("Tanque de queroseno en: " + queroseno);
        }

        if (oxigeno == 100.0) {
            listo = !listo;
        } else {
            System.out.println("Tanque de oxigeno en: " + oxigeno);
        }

        return listo;
    }
}