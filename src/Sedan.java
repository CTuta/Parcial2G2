/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1152471325
 */
public class Sedan extends Automovil{
    private double motor;
    private boolean frenos;

    public Sedan(double motor, boolean frenos, String placa, int modelo, double precio) {
        super(placa, modelo, precio);
        this.motor = motor;
        this.frenos = frenos;
    }

    public double getMotor() {
        return motor;
    }

    public boolean isFrenos() {
        return frenos;
    }
    
    public String frenosABS(int a){
        String r;
        if (a==1) {
            r="El automóvil tiene frenos ABS";
        }
        else {
            r="El automóvil no tiene frenos ABS";
        }
        return r;
    }
            
}
