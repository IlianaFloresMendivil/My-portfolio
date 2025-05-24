package starbu;

public abstract class CondimentoAbstracto implements Bebidas {

    protected Bebidas bebidas;

    public CondimentoAbstracto(Bebidas bebidas) {
        this.bebidas = bebidas;
    }

    public abstract String getDescripcion();
}
