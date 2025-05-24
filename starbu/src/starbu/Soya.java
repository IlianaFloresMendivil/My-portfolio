package starbu;

public class Soya extends CondimentoAbstracto {

    public Soya(Bebidas bebidas) {
        super(bebidas);
    }

    @Override
    public String getDescripcion() {
        return bebidas.getDescripcion() + ", Soya";
    }

    @Override
    public double costo() {
        return bebidas.costo() + 5.00;
    }

}
