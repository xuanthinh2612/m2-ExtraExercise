import java.util.*;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong hoa don: ");
        int max = sc.nextInt();
        int i = 0;
        while (i<max){
            manager.insert();
            i++;
        }
        System.out.println("Menu");
        System.out.println("1. Nhap vao thong tin khach hang");
        System.out.println("2. Hien thi thong tin khach hang");
        System.out.println("3. Xem tien dien ");
        System.out.println("0. Exit ");
        int choice = sc.nextInt();
        while (true){
            switch (choice){
                case 1:
                    manager.insert();
                    break;
                case 2:
                    System.out.print("Nhap vao id khach hang: ");
                    int id = sc.nextInt();
                    manager.showInfo(id);
                    break;
                case 3:
                    System.out.print("Nhap vao id khach hang: ");
                    int id1 = sc.nextInt();
                    manager.showMoney(id1);
                    break;
                case 0:
                    System.exit(0);

            }
            System.out.println("Menu");
            System.out.println("1. Nhap vao thong tin khach hang");
            System.out.println("2. Hien thi thong tin khach hang");
            System.out.println("3. Xem tien dien ");
            System.out.println("0. Exit ");
            choice = sc.nextInt();

        }
    }
}
