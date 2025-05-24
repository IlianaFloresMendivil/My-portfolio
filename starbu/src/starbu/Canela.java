package starbu;

public class Canela extends CondimentoAbstracto {

    public Canela(Bebidas bebidas) {
        super(bebidas);
    }

    @Override
    public String getDescripcion() {
        return bebidas.getDescripcion() + ",Canela";
    }

    @Override
    public double costo() {
        return bebidas.costo() + 7.00;
    }

}
