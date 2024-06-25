package com.traningmug.java;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
//        discount - product - customer membership and brand
        /*
        customer membership - Diamod - 20
        Gold - 15
        Silver - 10
         */
        Scanner sc = new Scanner(System.in);
        int productprice;
        productprice=3000;
        int discount;
        int discountpercentage;
        char membership = sc.next().charAt(0);

        System.out.println("Enter membershipe :");
        if(membership == 'D'){
            discountpercentage = 20;

        } else if (membership == 'G') {
            discountpercentage = 15;

        } else if (membership=='S') {
            discountpercentage=10;

        }else {
            discountpercentage=5;
        }
        discount=productprice * discountpercentage/100;
        System.out.println("Discount $ :" +discount);
        System.out.println("Finall Price $ :"+(productprice-discount));
    }
}
