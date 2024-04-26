/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1152471325
 */
public class Sport extends Moto{
    private String motor, potencia;

    public Sport(String motor, String potencia, String placa, int modelo, int cilindraje) {
        super(placa, modelo, cilindraje);
        this.motor = motor;
        this.potencia = potencia;
    }

    public String getMotor() {
        return motor;
    }

    public String getPotencia() {
        return potencia;
    }
      public String motorGarantia(int a){
        String r;
        if (a==1) {
            r="La garantía de la moto es por 2 años";
        }
        else {
            r="La garantía de la moto es por 1 año";
        }
        return r;
    }
}
