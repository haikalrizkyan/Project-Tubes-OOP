import java.util.Scanner;

public class Motor {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String jenis;
    int harga, jumlah, total;
    double ppn = 0.1;
    
    System.out.print("Masukkan jenis motor: ");
    jenis = input.nextLine();
    System.out.print("Masukkan harga motor: ");
    harga = input.nextInt();
    System.out.print("Masukkan jumlah motor: ");
    jumlah = input.nextInt();
    
    total = harga * jumlah;
    total += total * ppn;
    System.out.println("Total harga: " + total);
  }
  
}