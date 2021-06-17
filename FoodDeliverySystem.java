package fooddeliverysystem;

import java.util.Scanner;

public class FoodDeliverySystem  {

    static FoodStore foodStore = new FoodStore();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to food delivery System.");
        FoodDeliverySystem foodDeliverySystem = new FoodDeliverySystem();
        foodDeliverySystem.addfoodList();
    }

    public void addFood() {

        //FoodStore foodStore = new FoodStore();
            FoodItems foodItems = new FoodItems();
                System.out.println("Enter the food Name : ");
                foodItems.name = sc.nextLine();
                System.out.println("Enter the food price : ");
                foodItems.Price = sc.nextInt();
                System.out.println("Enter the food quantity : ");
                foodItems.quantity = sc.nextInt();
                System.out.println("Enter the food taste :");
                System.out.println("Press 1- Salty");
                System.out.println("Press 2 - Sweet");
                System.out.println("Press 3 - Spicy");

                int foodTaste = sc.nextInt();

                if (foodTaste == 1)
                    foodItems.taste = FoodItems.Taste.SALTY;
                else if (foodTaste == 2)
                    foodItems.taste = FoodItems.Taste.SWEET;
                else if (foodTaste == 3)
                    foodItems.taste = FoodItems.Taste.SPICY;

                System.out.println("Enter the food category : ");
                System.out.println("Press 1 - STARTER : ");
                System.out.println("Press 2 - Main Course : ");
                System.out.println("Press 3 - Desert : ");
                System.out.println("Press 4 - Snacks : ");

                int foodCat = sc.nextInt();

                if (foodCat == 1)
                    foodItems.foodCategory = FoodItems.Category.STARTER;
                else if (foodCat == 2)
                    foodItems.foodCategory = FoodItems.Category.MAIN_COURSE;
                else if (foodCat == 3)
                    foodItems.foodCategory = FoodItems.Category.DESERT;
                else if (foodCat == 4)
                    foodItems.foodCategory = FoodItems.Category.SNACK;

                foodStore.add(foodItems);

                sc.nextLine();
                //addfoodList();
            }

    public void addfoodList() {


        while (true) {
            System.out.println("Press 0 - Display all items");
            System.out.println("Press 1 - Display Starter");
            System.out.println("Press 2 - Display Main Course");
            System.out.println("Press 3 - Display Desert");
            System.out.println("Press 4 - Display Snacks");
            System.out.println("Press 5 - To add food");
            System.out.println("Press 6 to exit");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 0:
                    foodStore.display();
                    break;
                case 1:
                    foodStore.displayStarter();
                    break;
                case 2:
                    foodStore.displayMainCourse();
                    break;
                case 3:
                    foodStore.displayDesert();
                    break;
                case 4:
                    foodStore.displaySnack();
                    break;
                case 5:
                    addFood();
            }
            if (option == 6)
                break;
        }
    }
}
