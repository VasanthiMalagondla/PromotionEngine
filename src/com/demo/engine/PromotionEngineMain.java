package com.demo.engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PromotionEngineMain {
    public static void main(String[] args)
    {
        ArrayList<Product> products = new ArrayList<Product>();

        Scanner sc= new Scanner(System.in);
        System.out.print("Total number of products");
        int totalProd= sc.nextInt();
        PromotionEngineServiceImpl promotionEngineService = new PromotionEngineServiceImpl();
        for (int i = 0; i < totalProd; i++)
        {
            Scanner sc1= new Scanner(System.in);
            System.out.println("enter the type of SKUID:A,B,C or D");
            String productId= sc1.nextLine();
            Product p = new Product(productId);
            products.add(p);
        }
        int totalPrice = promotionEngineService.GetPriceUnderPromotion(products);
        System.out.println("Total Price is:" + totalPrice);
    }
}
