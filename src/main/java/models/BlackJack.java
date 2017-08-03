package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guest on 8/3/17.
 */
public class BlackJack {



    public List<Card> getDeck () {

        List<Card> deck = new ArrayList<Card>();
        String [] suits = {""};
        String [] faces = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        for (String suit: suits) {
            for (String face : faces) {
                System.out.println("new card" + face);
                Card newCard = new Card(suit, face);
                deck.add(newCard);
            }
        }
        return deck;
    }
}
