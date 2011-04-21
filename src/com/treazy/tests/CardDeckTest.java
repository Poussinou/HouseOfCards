package com.treazy.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import com.treazy.cards.CardDeck;
import com.treazy.cards.CardException;

/**
 * Unit Test Case for CardDeck.
 * 
 * @author Panagiotis Peikidis
 * @version 1.0
 *
 */
public class CardDeckTest {

  /**
   * Some tests for the contructor
   * 
   * @throws CardException 
   */
  @Test
  public void testCardDeck() throws CardException {
    CardDeck deck = new CardDeck(1,1);
    
    // Deal 55 times.
    for ( int i = 0; i < 55; i++ ) {
      deck.dealCard();
    }
    
    // Normally there is one card in the deck so this should not throw an exception
    deck.dealCard();
    
    // But this should
    try {
      deck.dealCard();
      fail("Normally this should throw an exception because there are 56 cards in the deck.");
    } catch (CardException e) { }
  }

}
