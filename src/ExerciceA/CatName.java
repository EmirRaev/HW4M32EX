package ExerciceA;

public enum CatName {
    ALICA("Кот"),
    TOM("Том"),
    ROCKI("Кошка");

    private String name;

    CatName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
