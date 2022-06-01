//package com.bank.atm.model;
//
//import static com.bank.atm.model.Bank.cards;
//
//public class SDAZ {
//    public static Data checkCard(String inserted){
//        Data cardData = null;
//        String massage = "";
//        for (Data card1 : cards){
//            massage="";
//            if(inserted.equals(card1.getCard_number())){
//                if(card1.isState()){
//                    cardData = card1;
//                    return cardData;
//                }else {
//                    System.out.println("bloklangan");
//                    return null;
//                }
//            }else{
//                massage = "Karta ID xato";
//                cardData = null;
//            }
//        }
//        System.out.println(massage);
//        return cardData;
//    }
//}
