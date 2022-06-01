package com.bank.atm.model;


import java.util.Scanner;

import static com.bank.atm.model.Bank.cards;
import static com.bank.atm.ui.Menu.userMenu;

public class Checker {
    static int index=0;

    public static int getIndex() {
        return index;
    }

    static Scanner scanner = new Scanner(System.in);


    public static String MainMenu(){
        while (true) {
            System.out.println("Kartangizni kiriting");
            String card_number = scanner.nextLine();
            check_card_number(card_number);
        }
    }
    public static void check_card_number(String cardNumber){
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].getCard_number().equals(cardNumber)){
                check_pin(i);
                break;
            } else if (i+1== cards.length){
                System.err.println("Bunday karta topilmadi");
                break;
            }
        }
    }


    public static void check_pin(int index){
        for (int i = 1; i <=3; i++) {
            System.out.println("Parolingizni kiriting");
            String password = scanner.nextLine();
            if (cards[index].getPassword().equals(password)){
                userMenu();
            }
            else {
                System.err.println("Parol xato");
            }
        }
    }

}
