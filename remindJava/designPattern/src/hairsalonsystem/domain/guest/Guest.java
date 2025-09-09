package hairsalonsystem.domain.guest;

// 미용실에 방문하는 손님을 나타내는 시스템
public class Guest {
    // 1. 손님은 예약을 할 수 있다.
    // 2. 손님은 예약할 메뉴를 고를 수 있다.
    // 3. 손님은 예약한 시간에 맞춰 방문한다.
    // 4. 손님은 예약을 취소할 수 있다.
    private String name; // 이름
    private String phoneNumber; // 전화번호

    public Guest(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }
}
