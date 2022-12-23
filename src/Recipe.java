import java.util.*;

public class Recipe {
    private  String name;
    private Map<Product,Integer> products;
    private  int price;



    public Recipe(String name) {
        this.name = name;
        this.products = new HashMap<>();
        this.price = 0;
    }

    public void add(Product product){
       add(product,1);
    }
    public void add(Product product,int amount){
        products.put(product,amount);
        price +=amount* product.getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
