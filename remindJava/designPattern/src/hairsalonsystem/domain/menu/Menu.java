package hairsalonsystem.domain.menu;

public enum Menu {
    CUT("커트", 15000), PERM("펌", 30000), COLOR("염색", 20000), DRY("드라이", 10000);

    private final String name;
    private final int price;

    Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("====[메뉴]====")
                .append("\n 1. ").append(CUT.getName() + " : " + CUT.getPrice() + "원")
                .append("\n 2. ").append(PERM.getName() + " : " + PERM.getPrice() + "원")
                .append("\n 3. ").append(COLOR.getName() + " : " + COLOR.getPrice() + "원")
                .append("\n 4. ").append(DRY.getName() + " : " + DRY.getPrice() + "원");
        return builder.toString();
    }
}
