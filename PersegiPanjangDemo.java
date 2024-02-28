import java.util.Scanner;
public class PersegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjang[] arrayofPersegiPanjang = new PersegiPanjang[3];
        int panjang, lebar;

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();

            arrayofPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);
        }
    
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1)+ ", panjang: " +
            arrayofPersegiPanjang[i].panjang + ", lebar: " + arrayofPersegiPanjang[i].lebar);
            arrayofPersegiPanjang[i].cetakInfo();
        }
    }
}