public class BurgerMain {
    public static void main(String[] args) {
        System.out.println("Звичайний бургер:");
        Burger regularBurger = new Burger();

        System.out.println("Дієтичний бургер (без майонезу):");
        Burger dietBurger = new Burger(true);

        System.out.println("Бургер з подвійним м'ясом та майонезом:");
        Burger doubleMeatBurger = new Burger(true, false);
    }
}
