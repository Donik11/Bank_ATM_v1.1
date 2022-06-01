package com.bank.atm.model;

public class Bank {
    static Data card1 = new Data(1, "UZCARD", "Azodov Doniyor", "8600", "04/2024", "0852", 2000000, "UZS", true, "AloqaBank");
    static Data card2 = new Data(2, "HUMO", "Sherjonov Jakhongir", "9860", "04/2026", "1234", 5000000, "UZS", true, "HamkorBank");
    static Data card3 = new Data(3, "VISA", "Sherjonov Zoxidjon", "4200", "04/2023", "1111", 252, "USD", false, "InfinBank");

    public static Data[] cards = {card1, card2, card3};
}



