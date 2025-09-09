package hairsalonsystem.domain;

import hairsalonsystem.domain.reservation.Reservation;

public class ReserveContext {
    private Reservation reserve;

    public static Reservation createReservation(Reservation reservation) {
        return reservation;
    }
}
