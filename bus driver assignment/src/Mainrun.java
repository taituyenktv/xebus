import person.*;

import java.util.Scanner;

public class Mainrun {

    public static Busdriver[] busdrivers = new Busdriver[500];
    public static Route[] routes = new Route[5000];
    public static Routeandturn[] routeandturns = new Routeandturn[10000];
    public static Assignment[] assignments = new Assignment[10000];
    public static Person[] Name = new Person[10000];

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        while (true) {
            showMenu();
            int functionchoose = functionchoose();
            switch (functionchoose) {
                case 1:
                    addnewbusdriver();
                    break;
                case 2:
                    showBusdriver();
                    break;
                case 3:
                    addnewRoute();
                    break;
                case 4:
                    shownewRoute();
                    break;
                case 5:
                    addcalendarManagement();
                    break;
                case 6:
                    showcalendarManagement();
                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:

                    return;
            }
        }
    }

    private static void showcalendarManagement() {
        for (int j = 0; j < routeandturns.length; j++) {
            if (routeandturns[j] != null) {
                System.out.println(routeandturns[j]);
            }
        }
    }


    private static void addcalendarManagement() {
        if(busdrivers.length==0 || routes.length==0){
            System.out.println(" Bạn cần nhập thông tin của Người lái xe: ");
            return;

        }
        System.out.println("Bạn muốn sắp xếp lịch cho mấy tài xế: ");
        int busNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < busNum; i++) {
            System.out.println("xếp lịch lái xe cho lái xe thứ:  "+(i+1));
            System.out.print("Nhập mã của Tài xế: ");
            int busdriverID;
            Busdriver busdriver = null;
            do {
                busdriverID = new Scanner(System.in).nextInt();
                for (int j = 0; j < busdrivers.length; j++) {
                    if (busdrivers[j].getId() == busdriverID) {
                        busdriver = busdrivers[j];
                        break;
                    }
                }

                if (busdriver != null){
                break;
                }
                System.out.println("Không tìm thấy Tài xế có mã "+busdriverID+ " vui lòng nhập lại");

        }while (true);

            System.out.println("Nhập số tuyến mà tài xế này muốn lái  : ");
            int routeNum = new Scanner(System.in).nextInt();
            Routeandturn[] detail = new Routeandturn[routeNum];
            int count = 0;
            int sumturn = 0;
            for (int j = 0; j < routeNum; j++) {
                System.out.println("Nhập thông tin của tuyến thứ "+ (j + 1) +" mà tài xế "+busdriver.getName()+" muốn lái");
                System.out.println("Nhập mã tuyến mà tài xế muốn lái :  ");
                int routeID;
                Route route = null;
                do {
                    routeID = new Scanner(System.in).nextInt();
                    for (int k = 0; k < routes.length; k++) {
                        if (routes[k].getRouteID() == routeID) {
                            route = routes[k];
                            break;
                        }
                    }

                    if (route != null){
                        break;
                    }
                    System.out.println("Không tìm thấy Tài xế có mã "+routeID+ " vui lòng nhập lại");

                }while (true);

                System.out.println("Tuyến này chạy bao nhiêu lượt");
                int turnNum;
                do {
                    turnNum = new Scanner(System.in).nextInt();
                    if (turnNum > 0 && turnNum < 15) {
                        break;
                    }
                    System.out.print("Số lượt muốn chạy không âm và nhỏ hơn 15, Xin mời nhập lại:  ");
                }while (true);

                    detail[count] = new Routeandturn(route, turnNum);
                    sumturn += routeNum*turnNum;
                    if (sumturn>15) {
                        System.out.println("Bạn không nên thêm tuyến này trong ngày nữa vì đã vượt quá số lượt quy định");
                        break;
                    }
                    count++;

                }

            Assignment assignments = new Assignment(busdriver, detail);
            saveRoutandturn(assignments);

            }

        }

    private static void saveRoutandturn(Assignment assignment) {
        for (int k = 0; k < assignments.length; k++) {
            if (assignments[k] == null) {
                assignments[k] = assignment;
                break;
            }
        }
    }

    private static void shownewRoute() {
        for (int j = 0; j < busdrivers.length; j++) {
            if (busdrivers[j] != null) {
                System.out.println(busdrivers[j]);

            }
        }

    }

    private static void saveRuote(Route route) {
        for (int k = 0; k < routes.length; k++) {
            if (routes[k] == null) {
                routes[k] = route;
                break;
                }
        }
    }

    private static void showBusdriver() {
        for (int j = 0; j < busdrivers.length; j++) {
            if (busdrivers[j] != null) {
                System.out.println(busdrivers[j]);

            }
        }
    }

    private static void addnewbusdriver() {
        System.out.println("Nhập Số lượng lái xe mới ");
        int busdiverNum = new Scanner(System.in).nextInt();
        if (busdiverNum<0){
            System.out.println("Mời nhập lại: ");
        }
        for (int i = 0; i < busdiverNum; i++) {
            Busdriver busdrive = new Busdriver();
            busdrive.nhaptt();
            saveBusdriver(busdrive);

        }
    }

        private static void saveBusdriver (Busdriver busdrive) {

            for (int k = 0; k < busdrivers.length; k++) {
                if (busdrivers[k] == null) {
                    busdrivers[k] = busdrive;
                    break;
                }
            }
        }

    private static void showMenu() {
        System.out.println("---------------PHẦN MỀM QUẢN LÝ PHÂN CÔNG LÁI XE BUÝT-------------");
        System.out.println("1. Nhập danh sách lái xe mới: ");
        System.out.println("2. In danh sách lái xe mới: ");
        System.out.println("3. Nhập danh sách tuyến mới: ");
        System.out.println("4. In danh sách tuyến mới: ");
        System.out.println("5. Nhập danh sách phân công cho mỗi lái xe: ");
        System.out.println("6. In danh sách phân công cho mỗi lái xe: ");
        System.out.println("7. Sắp xếp danh sách phân công theo họ tên: ");
        System.out.println("8. Sắp xếp danh sách phân công theo số lượng tuyến đảm nhận: ");
        System.out.println("9. Bảng kê tông khoảng cách trong ngày của mỗi lái xe");
        System.out.println("10. Thoát");
    }
    private static int functionchoose() {
        int choose = 0;
        do {
            choose = new Scanner(System.in).nextInt();
            if (choose >= 1 && choose <= 10) {
                break;
            }
            System.out.println("Lựa chọn không hợp lệ mời nhập lại ");
        } while (true);
        return choose;
    }
    private static void addnewRoute() {
        System.out.println("Nhập Số lượng điểm dừng mới ");
        int routeNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < routeNum; i++) {
            Route route = new Route();
            route.nhaptt();
            saveRuote(route);
        }
    }

}
