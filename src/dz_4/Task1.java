package dz_4;

public class Task1 {
    public static void main(String[] args) {
        Seasons favorite_Season = Seasons.SUMMER;
        favorite_Season.getDescription();
        like_seasons(favorite_Season);

        for (Seasons i: Seasons.values()) {
            System.out.printf("%s - %s, температура: %d\n", i.translate, i.description, i.temperature);
        }
    }

    public static void like_seasons(Seasons season) {
        System.out.printf("Я люблю %s\n", season.translate);
    }
}


enum Seasons {
    SUMMER(25, "лето", "Яркое солнце и тепло"),
    WINTER(-10, "зима", "Тусклое солнце и холодно"),
    AUTUMN(5, "осень", "Холодно и мокро"),
    SPRING(20, "весна", "Яркое солнце и тепло");
    final int temperature;
    final String translate;
    final String description;

    public void getDescription() {
        System.out.println(this.description);
    }

    Seasons(int i, String translate, String description) {
        temperature = i;
        this.translate = translate;
        this.description = description;
    }
}
