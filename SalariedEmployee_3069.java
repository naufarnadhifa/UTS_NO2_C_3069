/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.uts_no2_c_3069;

/**
 *
 * @author NAUFA ARNADHIFA
 */
public class SalariedEmployee_3069 extends Employee_3069 {
    protected String nama_3069;
    protected String nip_3069;
    protected float GajiPokok_3069;
    public SalariedEmployee_3069(){
        
    }
    
    public void TampilData(){
        System.out.println("Salaried Employee");
        Tampil();
        System.out.println("Total Gaji: " + GajiPokok_3069);
    }
}    

