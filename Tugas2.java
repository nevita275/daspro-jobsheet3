import java.util.Scanner;

import javax.swing.text.StyledEditorKit;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double upahPerjam, banyakjam;
        System.out.println("Masukkan upah perjam");
        upahPerjam = scanner.nextDouble();
        System.out.println("Masukkan banyaknya jam bekerja");
        banyakjam= scanner.nextDouble();
        double gajisatubulan = (upahPerjam * banyakjam);
        double bonus = (gajisatubulan * 1/10);
        double pajak = ((gajisatubulan + bonus) * 5/100);
        double gajibersih = (gajisatubulan + bonus - pajak);
        System.out.println("gaji dan bonus satu bulan: " + gajisatubulan);
        System.out.println("bonus satubulan: " + bonus);
        System.out.println("total gaji yang diperoleh: " + gajibersih);



    }
}