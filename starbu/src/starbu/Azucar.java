package starbu;

public class Azucar extends CondimentoAbstracto {

    public Azucar(Bebidas bebidas) {
        super(bebidas);
    }

    @Override
    public String getDescripcion() {
        return bebidas.getDescripcion() + ", Azucar";
    }

    @Override
    public double costo() {
        return bebidas.costo() + 10.00;
    }

}
