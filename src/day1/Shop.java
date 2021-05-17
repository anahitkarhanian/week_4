package day1;

import java.util.Scanner;

public class Shop {
    String name;
    String address;
    int countOfProduct;
    double priceForProduct;
    double shopBalance;
    Shop(){}
    Shop(String name) {
        this.name = name;
    }
    Shop(String name, String address){
        this.address = address;
        this.name = name;
    }
    Shop(String name, String address, int countOfProduct){
        this.address = address;
        this.name = name;
        this.countOfProduct = countOfProduct;
    }
    Shop(String name, String address, int countOfProduct, double priceForProduct){
        this.address = address;
        this.name = name;
        this.countOfProduct = countOfProduct;
        this.priceForProduct = priceForProduct;
    }
    Shop(String name, String address, int countOfProduct, double priceForProduct, double shopBalance){
        this.address = address;
        this.name = name;
        this.countOfProduct = countOfProduct;
        this.priceForProduct = priceForProduct;
        this.shopBalance = shopBalance;
    }

    boolean checkOrder(int countOfOrder){
        if(countOfOrder <= this.countOfProduct){
            return true;
        } else {
            return false;
        }
    }

    double  calculateOrder(int countOfOrder){
        return countOfOrder * this.priceForProduct;
    }

    void addToShopBalance(double money){
        this.shopBalance += money;
    }

    void questionAnswer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many product do you want");
        int amountOfProduct = scanner.nextInt();
        boolean check = checkOrder(amountOfProduct);
        if(check){
            System.out.println("if you want to buy it, Please press 1 , " +
                    "if you don’t want to buy it press any bottom");
            int checkWanted = scanner.nextInt();
            if(checkWanted == 1){
               double  money = calculateOrder(amountOfProduct);
                System.out.println("the price of products is " + money);
                addToShopBalance(money);
            }
        } else {
            System.out.println("Now we don’t have so much product,sorry");
        }


    }
}
