package hairsalonsystem.domain.reservation;

import hairsalonsystem.domain.guest.Guest;
import hairsalonsystem.domain.menu.Menu;

public class Reservation {
    private Guest guest; // 예약한 손님
    private Menu menu; // 예약한 메뉴
    private int price; // 예약한 메뉴의 가격

    public Reservation(Guest guest, Menu menu, int price) {
        this.guest = guest;
        this.menu = menu;
        this.price = price;
    }

    public Guest getGuest() {
        return guest;
    }

    public Menu getMenu() {
        return menu;
    }

    public int getPrice() {
        return price;
    }



    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("예약 정보 [고객명: ").append(guest.getName())
                .append(", ")
                .append("메뉴: ").append(menu.getName())
                .append("가격: ").append(price + "원");
        builder.append("]");
        return builder.toString();
    }
}
