package fooddeliverysystem;

public class FoodItems {
    enum Taste {
        SALTY, SWEET, SPICY
    }

    enum Category {
        STARTER, MAIN_COURSE, DESERT, SNACK
    }

    int Price;
    Taste taste;
    int quantity;
    Category foodCategory;
    String name;

    @Override
    public String toString() {
        return "FoodItems{" +
                "Price=" + Price +
                ", taste=" + taste +
                ", quantity=" + quantity +
                ", foodCategory=" + foodCategory +
                ", name='" + name + '\'' +
                '}';
    }


}

