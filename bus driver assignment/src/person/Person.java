package person;

import java.util.Scanner;

public class Person implements Inputinfo {
    protected String name;
    protected String add;
    protected  int phone;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", add='" + add + '\'' +
                ", phone=" + phone +
                '}';
    }
    @Override
    public void nhaptt(){
        System.out.print("Nhập Tên tài xé: ");
    this.name= new Scanner(System.in).nextLine();
        System.out.print("Nhập Địa chỉ : ");
    this.add= new Scanner(System.in).nextLine();
        System.out.print("Nhập Số điện thoại: ");
    this.phone= new Scanner(System.in).nextInt();

    }
}
