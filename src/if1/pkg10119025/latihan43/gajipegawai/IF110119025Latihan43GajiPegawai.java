/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan43.gajipegawai;

/**
 *
 * @author User
  * * NAMA     : ADHIRA FAHRI GATHAN
 * KELAS    : PBO
 * NIM      : 10119025
 * Deskripsi Program : Program ini berisi tentang Gaji Pegawai
 */

public class IF110119025Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        GajiPegawai pegawai = new GajiPegawai();
        pegawai.setNama("Ivan Faathirza");
        pegawai.setAlamat("RT 23, RW 06, Nomor 08, Caracas");
        pegawai.setGajiPokok(4500000);
        pegawai.setUangTunjangan(250000);
        pegawai.setUangTransport(300000);
        pegawai.setTotalGaji(
                pegawai.totalGaji(
                        pegawai.getUangTunjangan(),
                        pegawai.getUangTransport(),
                        pegawai.getGajiPokok()
                )
        );
        pegawai.tampilData(
                pegawai.getNama(),
                pegawai.getAlamat(),
                pegawai.getUangTunjangan(),
                pegawai.getUangTransport(),
                pegawai.getGajiPokok(),
                pegawai.getTotalGaji()
        );
    }
}
