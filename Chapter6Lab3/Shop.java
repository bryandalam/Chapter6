
// ***************************************************************

//   Shop.java

//

//   Uses the Item class to create items and add them to a shopping

//   cart stored in an ArrayList.

// ***************************************************************


import java.util.ArrayList;

import java.util.Scanner;


public class Shop

{
    

    public static void main (String[] args)

    {

        ArrayList<Item> cart = new ArrayList<Item>();


        Item item;

        String itemName;

        double itemPrice;

        int quantity;

        Scanner scan = new Scanner(System.in);


        String keepShopping = "y";


        while (keepShopping.equals("y")) 

            {

                System.out.print ("Enter the name of the item: ");

                itemName = scan.next();


                System.out.print ("Enter the unit price: ");

                itemPrice = scan.nextDouble();


                System.out.print ("Enter the quantity: ");

                quantity = scan.nextInt();


                // *** create a new item and add it to the cart
                Item thing = new Item(itemName, itemPrice, quantity);
                cart.add(thing);
                
                

                



                // *** print the contents of the cart object using println
                System.out.println(cart);


                System.out.print ("Continue shopping (y/n)? ");

                keepShopping = scan.next();

            }


        checkOut(cart);

    }


   public static void checkOut(ArrayList<Item> yourCart) {
       Scanner scan = new Scanner(System.in);
       String remove;
       int totalAmount = 0;
       int totalsize = 0;
        //You do NOT need a getter method (think about public instance variables)


        //Print the contents of the cart (you may use the toString() method
        System.out.println(yourCart);

        //Ask the user if they would like to remove an item.  If yes, remove that item.
         for(int i = 0; i < yourCart.size(); i++) {
                System.out.println(yourCart.get(i));
                System.out.println("Would you like to remove this item? (y/n)");
                remove = scan.next();
                if (remove.equals("y")) {
                    yourCart.remove(i);
                    i--;
                }
                
        }
        

        //Print final total of items and final price (total)
        for (int i = 0; i < yourCart.size(); i++) {
            totalAmount += (yourCart.get(i).price * yourCart.get(i).quantity);
            totalsize += (yourCart.get(i).quantity);
        }

        System.out.println("You have " + totalsize + " items in your cart. The total cost is " + totalAmount + ".");
        


   }
   

}