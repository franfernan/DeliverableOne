/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */


import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 * 
 * @author dancye
 */
public class GroupOfCards {

	// The group of cards, stored in an ArrayList
	private ArrayList <Card> deck = new ArrayList<Card>();
	private int size;// the size of the grouping

	public GroupOfCards() {
		for (int i = 0; i < 52; i++) {
			deck.add(new Card(i));
		}
	}

	/**
	 * A method that will get the group of cards as an ArrayList
	 * 
	 * @return the group of cards.
	 */
	public void shuffle() {
		Collections.shuffle(deck);
	}

	/**
	 * @return the size of the group of cards
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param givenSize the max size for the group of cards
	 */
	public void setSize(int givenSize) {
		size = givenSize;
	}
	
	public Card getCard(int cardNum) {
		return deck.get(cardNum);
	}

}// end class
