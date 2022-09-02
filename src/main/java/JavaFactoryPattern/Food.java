package JavaFactoryPattern;

import java.util.Scanner;

public interface Food {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String order = in.nextLine();

        while (order != "pizza" || order !="cake") {
            System.out.println("Please enter pizza or cake");
            order = in.nextLine();
            break;
        }
        if (order.equals("cake")) {
                System.out.println(new Cake().getType());
            }
            if (order.equals("pizza")) {
                System.out.println(new Pizza().getType());
            }
    }
}