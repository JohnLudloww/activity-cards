package org.example;

import javax.naming.OperationNotSupportedException;

public interface Deck {

    //api for card deck.
    void shuffle();
    void cut(int index);
    Card deal();
    Card  turnover();
    int search(Card card);
    void newOrder(Deck cards);
    int size();
    default int newSize() throws OperationNotSupportedException{
        throw new OperationNotSupportedException();
    }





}
