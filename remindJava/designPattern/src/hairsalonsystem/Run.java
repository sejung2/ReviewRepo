package hairsalonsystem;

import hairsalonsystem.domain.guest.Guest;
import hairsalonsystem.presentation.MenuSystem;

public class Run {
    public static void main(String[] args) {

        new MenuSystem(new Guest("김철수", "010-1234-5678")).menu();
    }
}
