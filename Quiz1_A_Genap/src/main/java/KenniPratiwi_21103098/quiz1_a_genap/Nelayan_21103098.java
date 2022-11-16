/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KenniPratiwi_21103098.quiz1_a_genap;

/**
 *
 * @author Asus
 */
public class Nelayan_21103098 extends Penduduk_21103098 {
    int jmlBeratIkan;
    int jmlSolar;
    double totalPendapatNelayan;

    public double totalPendapatNelayan() {
        return totalPendapatNelayan = (jmlBeratIkan * 9.000) + (jmlSolar + 15.000);
    }
    
    public void DataNelayan(){
        System.out.println("Jumlah Berat Ikan : " + jmlBeratIkan);
        System.out.println("Jumlah Pakai Solar : " + jmlSolar);
    }
}
