package org.example;

public class DeckDriver {
    public static void main(String[] args)
    {
        Deck cards = new Standarddeck() ;
        displayDeck(cards);
        cards.shuffle();
        displayDeck(cards);




    }

    private static void displayDeck(Deck cards) {
        System.out.println(cards);
    }









}
