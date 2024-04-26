/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1152471325
 */
public class ChevroletSail extends Sedan{
    private String tanque;
    private boolean seguro;

    public ChevroletSail(String tanque, boolean seguro, double motor, boolean frenos, String placa, int modelo, double precio) {
        super(motor, frenos, placa, modelo, precio);
        this.tanque = tanque;
        this.seguro = seguro;
    }

    public String getTanque() {
        return tanque;
    }

    public boolean isSeguro() {
        return seguro;
    }
     public String seguro (int a){
        String r;
        if (a==1) {
            r="El automovil tiene seguro todo riesgo";
        }
        else {
            r="El automovil no tiene seguro todo riesgo";
        }
        return r;
    }
     public String precioSeguro (int a){
        String r2;
        double p=0;
        if (a>=50000000) {
            p=a*(0.1);
            r2= p+"";
        }
        else {
            r2="No hay valor del seguro puesto que el valor del automóvil es menor a 50.000.000";
        }
        return r2;
}
}
