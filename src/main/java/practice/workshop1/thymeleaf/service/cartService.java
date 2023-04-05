package practice.workshop1.thymeleaf.service;

import java.util.ArrayList;
import java.util.List;

import practice.workshop1.thymeleaf.model.cartModel;

public class cartService {
    

    //adding item to cart
    public static void Arraylist(String newItem){
        List<cartModel> cart = new ArrayList<cartModel>();
        cart.add(newItem);

    }
    

}
