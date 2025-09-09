package hairsalonsystem.presentation;

import hairsalonsystem.domain.account.Account;
import hairsalonsystem.domain.guest.Guest;
import hairsalonsystem.domain.menu.Menu;
import hairsalonsystem.domain.reservation.Reservation;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MenuSystem {

    private Account account = Account.getInstance();
    private Guest guest;
    private Reservation reservations;
    private Menu[] menu = Menu.values();

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
                System.out.println("2. 예약조회");
                System.out.println("3. 종료");
                System.out.print("입력 : ");
                int menuInput = input.nextInt();

                if (menuInput == 3) {
                    System.out.println("[system] : 종료합니다.");
                    break;
                }

                if (menuInput < 1 || menuInput > 2) {
                    System.out.println("system : 잘못 입력하셨습니다.");
                    continue;
                }

                if (menuInput == 1) {
                    for (int i = 0; i < menu.length; i++) {
                        System.out.println((i + 1) + ". " + menu[i].getName() + " : " + menu[i].getPrice() + "원");
                    }
                    System.out.print("예약할 메뉴를 선택하세요 : ");
                    int selectMenu = input.nextInt();
                    switch (selectMenu) {
                        case 1 -> {
                            reservations = new Reservation(guest, Menu.CUT, Menu.CUT.getPrice());
                            System.out.println("[system] : " + reservations + " 예약이 완료되었습니다.");
                            account.addBalance(Menu.CUT.getPrice());
                        }
                        case 2 -> {
                            reservations = new Reservation(guest, Menu.PERM, Menu.PERM.getPrice());
                            System.out.println("[system] : " + reservations + " 예약이 완료되었습니다.");
                            account.addBalance(Menu.PERM.getPrice());
                        }
                        case 3 -> {
                            reservations = new Reservation(guest, Menu.COLOR, Menu.COLOR.getPrice());
                            System.out.println("[system] : " + reservations + " 예약이 완료되었습니다.");
                            account.addBalance(Menu.COLOR.getPrice());
                        }
                        case 4 -> {
                            reservations = new Reservation(guest, Menu.DRY, Menu.DRY.getPrice());
                            System.out.println("[system] : " + reservations + " 예약이 완료되었습니다.");
                            account.addBalance(Menu.DRY.getPrice());
                        }
                        default -> {
                            System.out.println("system : 잘못 입력하셨습니다.");
                            continue;
                        }
                    }
                }

                if (menuInput == 2) {
                    if (reservations == null) {
                        System.out.println("[system] : 예약 내역이 없습니다.");
                    } else {
                        System.out.println("[system]: " + reservations);
                    }
                }
            } catch (NoSuchElementException e) {
                e.printStackTrace();
                continue;
            }
        }
    }
}
