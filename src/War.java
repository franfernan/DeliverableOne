public class War {

	public static void main(String[] args) {
		GroupOfCards deck = new GroupOfCards();
		deck.shuffle();
		for (int i = 0; i < 52; i++) {
			System.out.println(deck.getCard(i));
		}
//hisdf
	}

}
