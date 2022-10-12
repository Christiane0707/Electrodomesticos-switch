
import javax.swing.JOptionPane;

public class ValorElectro {
    
 //Declaracion de variable
    private String tipoE;
    private int cant;
    private double trans,iva,precio,pago;
    //Creacion del constructor
    public ValorElectro(){
        tipoE="";
        cant=0;
        trans=0.0; iva=0.0; precio=0.0; pago=0.0;
    }
    //creacion de los metodos
    public void pedirDatosDeCompra(){
        tipoE=JOptionPane.showInputDialog("Seleccion tipo de electrodomestico:\nNevera\nLavadora\nCalentador\nAire\nEstufa").toLowerCase();
        cant=Integer.parseInt(JOptionPane.showInputDialog("Cuantas unidades desea?")); 
    }
    public double asignaPrecio(){
        switch (tipoE){
            case "nevera":
            precio=1200000*cant;
            trans=15000;   
            break;
            case "lavadora":
            precio=790000*cant;
            trans=10000;
            break;
            case "calentador":
            precio=480000*cant;
             trans=5000;
            break;
            case "aire":
            precio=1000000*cant;
             trans=7000;
            break;
            case "estufa":
            precio=580000*cant;
            trans=10000;
        break;
        }
        return (precio);
    }
   
      public double CalcularIva(){
         iva=precio*0.20;                  
        return (iva);
    }
      public double calcularPago(){
          pago=precio+iva+trans;
                  return(pago);              
      }
      public void mostrarFactura(){
          JOptionPane.showMessageDialog(null,"\nTipo electrodomestico "+tipoE+
                  "\ncantidad "+cant+"\nTransporte $"+trans+"\nIva $"+iva+"\nPago $"+pago);
      }      
}
