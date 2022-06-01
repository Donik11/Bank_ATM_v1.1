package com.bank.atm.ui;

import com.bank.atm.model.Checker;

import java.util.Scanner;

import static com.bank.atm.model.Bank.cards;


public class Menu {
    public static void userMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check){

            System.out.println("Kerakli bo'limni tanlang...\n" +
                    "1: Balance\n" +
                    "2: Pul Yechish\n" +
                    "3: Kartani to'ldirish\n" +
                    "4: Parolni o'zgartirish\n" +
                    "0: Chiqish");
            switch (scanner.nextInt()){
                case 0: {
                    System.err.println("Bizning xizmatimizdan foydalanganingiz uchun tashakkur!!!");
                    check = false;
                    break;
                }
                case 1: {
                    System.out.println("Balance");
                    int index = Checker.getIndex();
                    System.out.println(cards[index].getBalance());
                    break;
                }
                case 2: {
                    System.out.println("Pul yechish");
                    break;
                }
                case 3: {
                    System.out.println("Kartani to'ldirish");
                    break;
                }
                case 4: {
                    System.out.println("Parolni o'zgartirish");
                    break;
                }
            }
        }
    }
}
