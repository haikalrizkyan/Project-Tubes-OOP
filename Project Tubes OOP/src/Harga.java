public class Harga  {
    public static void main(String[] args) {
        String[] jenis = {"Beat", "Vario 125 New", "NMax", "GSX-R150", "Aerox"};
        int[] harga = {15000000, 22000000, 25000000, 28000000, 27000000};
        
        System.out.println("Daftar harga motor:");
        for(int i=0; i<jenis.length; i++) {
          System.out.println(jenis[i] + ": Rp " + harga[i]);
        }
      }    
}
