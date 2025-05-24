package starbu;

public class TeChai implements Bebidas {

    @Override
    public String getDescripcion() {
        return "Té Chai";
    }

    @Override
    public double costo() {
        return 35.00;
    }

}
