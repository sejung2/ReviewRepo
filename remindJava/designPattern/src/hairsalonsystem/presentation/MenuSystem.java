package hairsalonsystem.presentation;

import hairsalonsystem.domain.account.Account;
import hairsalonsystem.domain.guest.Guest;
import hairsalonsystem.domain.menu.Menu;
import hairsalonsystem.domain.reservation.Reservation;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class MenuSystem {

    private Account account = Account.getInstance();
    private Guest guest;
    private Reservation[] reservations;
    private Menu menu;

    public MenuSystem(Guest guest) {
        this.guest = guest;
    }

    public void menu() {

        while (true) {

            try {
                Scanner input = new Scanner(System.in);
                System.out.println("환영합니다 " + guest.getName() + "님");
                System.out.println("==== menu ====");
                System.out.println("1. 예약하기");
                System.out.println("2. 예약취소");
                System.out.println("3. 종료");
                System.out.print("입력 : ");
                int menuInput = input.nextInt();

                if (menuInput == 3) {
                    System.out.println("[system] : 종료합니다.");
                    break;
                }

                if (menuInput < 1 || menuInput > 3) {
                    System.out.println("system : 잘못 입력하셨습니다.");
                    continue;
                }

                if (menuInput == 1) {
                    System.out.println("예약 메뉴");
                    System.out.println(menu);
                    System.out.println("나가기: 0");
                    System.out.print("번호 : ");
                    int menuNo = input.nextInt();
                    if (menuNo == 0) {
                        System.out.println("[system] : 나갑니다.");
                        continue;
                    }

                    if (menuNo == 1) {

                    }
                }
            } catch (NoSuchElementException e) {
                e.printStackTrace();
                continue;
            }
        }
    }
}
