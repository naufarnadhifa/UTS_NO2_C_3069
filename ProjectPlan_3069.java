/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.uts_no2_c_3069;

/**
 *
 * @author NAUFA ARNADHIFA
 */
public class ProjectPlan_3069 extends Employee_3069{
   public float komisi_3069;
    public float TotalHslProyek_3069;
    public double TotalGaji_3069;
    
    public ProjectPlan_3069(){
        
    }
            
    public double TotalGaji(){
        TotalGaji_3069 = GajiPokok_3069 + (komisi_3069 * TotalHslProyek_3069) - (GajiPokok_3069*5/100);
        return TotalGaji_3069;
    }
    
    public void TampilData(){
        System.out.println("Project Plannner");
        Tampil();
        System.out.println("Total Gaji: " + TotalGaji_3069);
    } 
}
    
