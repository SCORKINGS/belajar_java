import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner inputkeyboard = new Scanner(System.in);  // Create a Scanner object
    String userName, NIM, prodi;
    System.out.println("==========Input==========");
    
    System.out.print("Nama: ");
    userName = inputkeyboard.nextLine();
    

    System.out.print("NIM: ");
    NIM = inputkeyboard.nextLine();
    
    System.out.print("Program Studi: ");
    prodi = inputkeyboard.nextLine();

    //nextline() untuk membaca inputan dari keyboard tipe data string
    
    System.out.println("HI " + userName + ", Anda terdaftar dengan NIM: " + NIM + " di Program Studi " + prodi);  // Output user input

    


  }
}

