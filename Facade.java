public class Facade {

    Combustible combustible = new Combustible();

    public void listo() {
        combustible.verificarQueroseno(100.0f);
        combustible.verificarOxigenoLiquido(100.0f);
        boolean combustibleListo = combustible.verificarEstadoCombustible();
        System.out.println(combustibleListo);
    }

    public void abortar() {
        
    }
    

}