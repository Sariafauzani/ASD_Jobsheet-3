import java.util.Scanner;
public class PersegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int arrayLength = sc.nextInt();

        PersegiPanjang[] arrayofPersegiPanjang = new PersegiPanjang[arrayLength];
        int panjang, lebar;

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();

            arrayofPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);
        }

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1)+ ", panjang: " +
            arrayofPersegiPanjang[i].panjang + ", lebar: " + arrayofPersegiPanjang[i].lebar + ", luas: " + 
            arrayofPersegiPanjang[i].hitungLuas() + ", keliling: " + arrayofPersegiPanjang[i].hitungKeliling());
            
            arrayofPersegiPanjang[i].cetakInfo(); 
        }
    }
}