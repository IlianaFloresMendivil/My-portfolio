package starbu;

public class Matcha implements Bebidas {

    @Override
    public String getDescripcion() {
        return "Té de Matcha";
    }

    @Override
    public double costo() {
        return 50.00;
    }

}
