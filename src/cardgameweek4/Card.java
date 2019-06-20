package cardgameweek4;
/**
 * Starter code for the Card class.
 * To be used in Week 4.
 * @author dancye, 2019
 */
public class Card {
    //Encapsulation because its made private 
        public enum Suit {RED, BLUE,GREEN,YELLOW};
        public enum Value{ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, BLOCK, REVRSE, WILD, PLUSFOUR,PLUSTWO,
		TEN,};
        private final Suit suit;
        private final Value value;
        
        public Card(Suit s, Value gVal)
        {
           suit =s;
           value= gVal;
        }
        //getters
	public Value getValue() {
		return this.value;
	}

	
	public Suit getSuit() {
		return this.suit;
        }
}