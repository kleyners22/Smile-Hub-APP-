package edu.unl.cc.domain;

public class ItemComprobante {
    private double PrecioUnitario;
    private int cantidadTotal;
    private double subototalItem;

    public ItemComprobante(){

    }

    public ItemComprobante(double PrecioUnitario,
                           int cantidadTotal,
                           double subototalItem){
        this.PrecioUnitario = PrecioUnitario;
        this.cantidadTotal = cantidadTotal;
        this.subototalItem = subototalItem;
    }

    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.PrecioUnitario = precioUnitario;
    }

    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public double getSubototalItem() {
        return subototalItem;
    }

    public void setSubototalItem(double subototalItem) {
        this.subototalItem = subototalItem;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ItemComprobante{");
        sb.append("PrecioUnitario=").append(PrecioUnitario);
        sb.append(", cantidadTotal=").append(cantidadTotal);
        sb.append(", subototalItem=").append(subototalItem);
        sb.append('}');
        return sb.toString();
    }
}
