package starbu;

public class Espresso implements Bebidas {

    @Override
    public String getDescripcion() {
        return "Espresso";
    }

    @Override
    public double costo() {
        return 30.00;
    }

}
