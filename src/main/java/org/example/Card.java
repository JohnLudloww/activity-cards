package org.example;

import javax.swing.plaf.ComponentInputMapUIResource;

public class Card implements Comparable<Card> {
private  suit suit;
private FaceValue value;

    public Card(suit suit, FaceValue faceValue)

{
    this.suit = suit;
    value = faceValue;

}
public int compareTo(Card o)
{
    return 0;
}

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Card{");
        sb.append(value);
        sb.append(" of " );
        sb.append(suit);
        sb.append("}");
        return sb.toString();
    }
}
