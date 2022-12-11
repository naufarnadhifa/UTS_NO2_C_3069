/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.uts_no2_c_3069;

/**
 *
 * @author NAUFA ARNADHIFA
 */
public class CommissionEmployee_3069 extends Employee_3069 {
    public float komisi_3069;
    public float TotalPenjualan_3069;
    public float TotalGaji_3069;
    
    public CommissionEmployee_3069(){
        
    }
    
    public float TotalGaji(){
        TotalGaji_3069 = GajiPokok_3069 + (komisi_3069 * TotalPenjualan_3069);
        return TotalGaji_3069;
    }
    
    public void TampilData(){
        System.out.println("Commission Employee");
        Tampil();
        System.out.println("Total Gaji: " + TotalGaji_3069);
    }
    
}
