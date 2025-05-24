package starbu;

public class Leche extends CondimentoAbstracto {

    public Leche(Bebidas bebidas) {
        super(bebidas);
    }

    @Override
    public String getDescripcion() {
        return bebidas.getDescripcion() + ", Leche";
    }

    @Override
    public double costo() {
        return bebidas.costo() + 10.00;
    }

}
