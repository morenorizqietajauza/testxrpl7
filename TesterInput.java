import java.util.Scanner;

public class TesterInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inputkan nama CD: ");
        String name=s.nextLine();
        System.out.println("Inputkan nama artist:");
        String artist=s.nextLine();
        System.out.println("Inputkan nama label");
        String label=s.nextLine();
        System.out.println("Inputkan angka");
        int number=s.nextInt();
        System.out.println("inputkan jumlah");
        int quantity=s.nextInt();
        System.out.println("inputkan total lagu");
        int totalSong=s.nextInt();
        System.out.println("inputkan total harga");
        double price=s.nextDouble();

        CD cd1 = new CD(number,name,quantity,price,artist,totalSong,label);
        cd1.print();
    }
}