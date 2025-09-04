package hairsalonsystem.domain.reservation;

import hairsalonsystem.domain.guest.Guest;
import hairsalonsystem.domain.menu.Menu;

public class Reservation {
    private Guest guest; // 예약한 손님
    private Menu menu; // 예약한 메뉴
    private String reservedTime; // 예약한 시간
    private int price; // 예약한 메뉴의 가격
    private boolean isCancelled; // 예약 취소 여부

    public Reservation(Guest guest, Menu menu, String reservedTime, int price) {
        this.guest = guest;
        this.menu = menu;
        this.reservedTime = reservedTime;
        this.price = price;
        this.isCancelled = false;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public String getReservedTime() {
        return reservedTime;
    }

    public void setReservedTime(String reservedTime) {
        this.reservedTime = reservedTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("예약 정보 [고객명: ").append(guest.getName() + "님")
                .append("\n메뉴: ").append(menu.getName())
                .append("\n예약 시간").append(reservedTime)
                .append("\n가격: ").append(price + "원");
        if (isCancelled) {
            builder.append("\n예약 상태: 취소됨");
        } else {
            builder.append("\n예약 상태: 예약됨");
        }
        builder.append("]");
        return builder.toString();
    }
}
