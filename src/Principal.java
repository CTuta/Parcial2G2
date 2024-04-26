
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
           int  opcion = Integer.parseInt(JOptionPane.showInputDialog("****** CONCESIONARIO CAUCANA DE VEHÍCULOS S.A.********\n" +
"******* REGISTRO DE VEHÍCULOS VENDIDOS******** \n"
              + " 1: Registro de automóviles \n"
              + " 2: Registro de motos \n"
              + " 3: Vendedor \n"     
              + " 4: Salir"));
    
    switch(opcion){
        case 1:
    String placaA= JOptionPane.showInputDialog("Placa del automovil");
        ChevroletSail auto1 = new ChevroletSail("3 Galones",true, 1500 , true, placaA, 2020, 0);  
        JOptionPane.showMessageDialog(null,"La capacidad del tanque es: "+auto1.getTanque()
                +"\n"+auto1.frenosABS(1)
                +"\n"+auto1.precioSeguro(52000000)
                +"\n"+auto1.seguro(1)
                +"\n"+"El motor es: "+auto1.getMotor()         
                +"\n"+"La placa es: "+auto1.getPlaca()
                +"\n"+"El modelo es: "+auto1.getModelo());
        break;
        case 2:
          String placaM= JOptionPane.showInputDialog("Placa de la moto");
          Sport moto1 = new Sport("4T","12",placaM,2021,150);
          JOptionPane.showMessageDialog(null,"El motor es: "+moto1.getMotor()
                +"\n"+"los caballos de fuerza de la moto son: "+moto1.getPotencia()
                +"\n"+"El modelo de la moto es: "+moto1.getModelo()
                +"\n"+"El cilindraje es: "+moto1.getCilindraje()
                +"\n"+"La placa es: "+moto1.getPlaca()
                +"\n"+moto1.motorGarantia(1));
         break;
        case 3:
            JOptionPane.showInternalMessageDialog(null,"Juan Camilo Serna Tuta"
                    + "\nCesar Mauricio Florez Ruiz");
            break;
        case 4:
            break;
    }
}
}