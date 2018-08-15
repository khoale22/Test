package model;


import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khoale123
 */
public class Cart {
    
    
    private HashMap<Long , Item> cartitems ;

    public Cart() {
        
        cartitems = new HashMap<>();
    }

    public Cart(HashMap<Long, Item> cartitems) {
        this.cartitems = cartitems;
    }

    public HashMap<Long, Item> getCartitems() {
        return cartitems;
    }

    public void setCartitems(HashMap<Long, Item> cartitems) {
        this.cartitems = cartitems;
    }
    
    public void plusToCart(Long key, Item item){
       
        boolean check = cartitems.containsKey(key);
        if(check){
            
            int quanlity_old = item.getQuanlity();
            int quanlity = quanlity_old + 1;
            item.setQuanlity(quanlity);
            cartitems.put(key, item);
           
            
           // cartitems.keySet()  return tap hop key .values(); retuen tap hop value
           // . getkey() chi 1 key retuen ve 1 keu cua key do 
           // getkey(idproduct) chi 1 key 1 gia tri , neu co chi dinh retuen ve gia tri
            
        } else{
                     
                    cartitems.put(key, item);
             }   
        
        
        
    }
       public double totalCart() {
        double count = 0;
        // count = price * quantity
        for (Map.Entry<Long, Item> list : cartitems.entrySet()) {
            count += list.getValue().getProduct().getProductPrice() * list.getValue().getQuanlity();
            
            
        }
        return count;
    }
     public void removeToCart(Long key) {
        boolean check = cartitems.containsKey(key);
        if (check) {
            cartitems.remove(key);
        }
    }
    
    
    
    
}
