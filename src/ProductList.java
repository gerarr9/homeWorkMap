import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProductList {
    private Map<Product,Integer> products = new HashMap();

    public  void add(Product product,int amount){
       products.put(product,amount);
    }
    public void  add(Product product){
        add(product,1);
    }
}
