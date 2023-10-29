public class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String veggies;
    private String mayo;
    public Burger() {
        bun = "Булочка";
        meat = "М'ясо";
        cheese = "Сир";
        veggies = "Зелень";
        mayo = "Майонез";
        printIngredients();
    }
    public Burger(boolean Diet) {
        bun = "Булочка";
        meat = "М'ясо";
        cheese = "Сир";
        veggies = "Зелень";
        if (Diet) {
            mayo = "Без майонезу";
        } else {
            mayo = "Майонез";
        }
        printIngredients();
    }
    public Burger(boolean DoubleMeat, boolean Diet) {
        bun = "Булочка";
        if (DoubleMeat) {
            meat = "Подвійне м'ясо";
        } else {
            meat = "М'ясо";
        }
        cheese = "Сир";
        veggies = "Зелень";
        if (Diet) {
            mayo = "Без майонезу";
        } else {
            mayo = "Майонез";
        }
        printIngredients();
    }
    private void printIngredients() {
        System.out.println("Склад бургера:");
        System.out.println(bun);
        System.out.println(meat);
        System.out.println(cheese);
        System.out.println(veggies);
        System.out.println(mayo);
        System.out.println();
    }
}

