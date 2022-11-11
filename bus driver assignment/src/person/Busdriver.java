package person;

import constant.Driverlv;

import java.util.Scanner;

public class Busdriver extends Person {
    public static int AUTO_ID = 10000;

    private int id;
    private String lever;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLever() {
        return lever;
    }

    public void setLever(String lever) {
        this.lever = lever;
    }

    @Override
    public String toString() {
        return "busdriver{" +
                "id=" + id +
                ", lever='" + lever + '\'' +
                ", name='" + name + '\'' +
                ", add='" + add + '\'' +
                ", phone=" + phone +
                '}';
    }

    @Override
    public void nhaptt() {
        this.id = AUTO_ID;
        AUTO_ID++;
        super.nhaptt();
        System.out.println("Nhập Loại Bằng Lái: ");
        System.out.println("1. Loại A");
        System.out.println("2. Loại B");
        System.out.println("3. Loại C");
        System.out.println("4. Loại D");
        System.out.println("5. Loại E");
        System.out.println("6. Loại F");
        System.out.println(" Chọn loại bằng:  ");
        int chose = 0;
        do {
            chose = new Scanner(System.in).nextInt();
            if (chose >=1 && chose<=6){
                break;
            }
            System.out.println("Lựa chọn không hợp lệ mời nhập lại ");
        }while (true);

        switch (chose){
            case 1:
                this.lever = Driverlv.Loại_A.value;
                break;
            case 2:
            this.lever = Driverlv.Loại_B.value;
                break;
            case 3:
            this.lever = Driverlv.Loại_C.value;
                break;
            case 4:
            this.lever = Driverlv.Loại_D.value;
                break;
            case 5:
            this.lever = Driverlv.Loại_E.value;
                break;
            case 6:
            this.lever = Driverlv.Loại_F.value;
                break;
        }

    }
}
