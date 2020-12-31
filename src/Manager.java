import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    public static Scanner scanner = new Scanner(System.in);
    List<Bill> list  = new ArrayList<>();
    public void insert(){

        System.out.println("Vui long nhap cac thong tin khach hang : ");
        System.out.print("Ho Ten Chu Ho : ");
        String name = scanner.nextLine();
        System.out.print("So Nha : ");
        int houseNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Ma So Cong To : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Chi So Cong To Moi : ");
        int newNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Chi So Cong To Cu : ");
        int oldNumber = Integer.parseInt(scanner.nextLine());
        Bill bills = new Bill(name,houseNumber,id,oldNumber,newNumber);
        list.add(bills);
    }
    public void showInfo(int id) {
        for (Bill b : list){
            if (b.getId()==id){
                System.out.println(b);
                return;
            }
        }
        System.out.println("not found!");

    }
    public void showMoney(int id){
        for (Bill b : list){
            if (b.getId()==id){
                System.out.println("So Tien Phai Tra Thang nay cua khach hang "+ b.getName()+" co id "+b.getId()+"la: "+b.total());
            }
        }

    }

}
