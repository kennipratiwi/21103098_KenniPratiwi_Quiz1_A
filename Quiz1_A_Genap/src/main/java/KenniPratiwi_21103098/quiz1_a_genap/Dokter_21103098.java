/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KenniPratiwi_21103098.quiz1_a_genap;

/**
 *
 * @author Asus
 */
public class Dokter_21103098 extends Penduduk_21103098 {
    int jmlPasien;
    int jmlObat;
    double totalPendapatanDokter;
    
    public void DataDokter(){
        System.out.println("Jumlah Pasien : " + jmlPasien);
        System.out.println("Jumlah Obat : " + jmlObat);
    }
    
    public double totalPendapatanDokter (){
        return totalPendapatanDokter = (jmlPasien * 40.000) + (jmlObat * 20.000);
    }
}
