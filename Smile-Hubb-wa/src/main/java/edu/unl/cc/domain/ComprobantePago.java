package edu.unl.cc.domain;

public class ComprobantePago {
    private double subtotal;
    private double total;

    public ComprobantePago(){

    }

    public ComprobantePago(double subtotal, double total){
        this.subtotal=subtotal;
        this.total=total;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Comprobante Pago{");
        sb.append("subtotal=").append(subtotal);
        sb.append(", total=").append(total);
        sb.append('}');
        return sb.toString();
    }
}
