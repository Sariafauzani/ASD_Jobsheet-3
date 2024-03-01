import java.util.Scanner;
public class InfoMhs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] arrayofInfoMhs = new Mahasiswa[3];
        double total, rataRata;

        for (int i = 0; i < 3; i++) {
            arrayofInfoMhs[i] = new Mahasiswa();
            System.out.println("Masukkan data mahasiswa ke- " + (i + 1));
            System.out.print("Masukkan nama mahasiswa: ");
            arrayofInfoMhs[i].nama = sc.nextLine();
            System.out.print("Masukkan NIM: ");
            arrayofInfoMhs[i].nim = sc.nextLine();
            System.out.print("Masukkan jenis kelamin (L/P): ");
            arrayofInfoMhs[i].jenisKelamin = sc.next().charAt(0);
            System.out.print("Masukkan Ipk: ");
            arrayofInfoMhs[i].ipk = sc.nextDouble();
            sc.nextLine();

        }
        System.out.println("==================================");
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Mahasiswa ke- " + (i + 1));
            System.out.println("Nama: " + arrayofInfoMhs[i].nama);
            System.out.println("Nim: " + arrayofInfoMhs[i].nim);
            System.out.println("Jenis kelamin: " + arrayofInfoMhs[i].jenisKelamin);
            System.out.println("Ipk: " + arrayofInfoMhs[i].ipk);
        }

        total = 0;
        for (int i = 0; i < arrayofInfoMhs.length; i++) {
            total = total + arrayofInfoMhs[i].ipk;
        }

        rataRata = total / arrayofInfoMhs.length;

        System.out.println("Rata-rata Ipk mahasiswa: " + rataRata);
    }
}
