package starbu;

public class Decaf implements Bebidas {

    @Override
    public String getDescripcion() {
        return "Cafe Descafeinado";
    }

    @Override
    public double costo() {
        return 20.00;
    }

}
