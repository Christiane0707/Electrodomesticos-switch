import javax.swing.*;
public class PrincipalElectro {
    public static void main(String args[]){
        ValorElectre val=new ValorElectro();
        val.pedirDatosDeCompra();
        val.asignaPrecio();
        val.CalcularIva();
        val.calcularPago();
        val.mostrarFactura();
        System.exit(0);
    }
}


    
