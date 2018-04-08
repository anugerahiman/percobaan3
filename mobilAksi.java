package percobaan3;

public class mobilAksi {
   public static void main(String[] args){
        mobil A = new mobil();  
   
        A.setMerk("Brio");
        A.setWarna("Merah");
        A.setHarga(170000000);
        
        A.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(A.getmerk());
        System.out.print("Warnanya \t: ");
        System.out.println(A.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(A.getHarga());
   }
