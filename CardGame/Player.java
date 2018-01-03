package Practise1;

import java.util.ArrayList;

public class Player {
	public ArrayList<Card> playerCards=new ArrayList<Card>();
	
	public void playerCardsAdd(Card c){
		playerCards.add(c);
	}
	public Card playerCardsDiscard(int i){
		Card cd=playerCards.get(i);
		playerCards.remove(i);
		return cd;
	}
	public void printPlayerCards(){
		int i=0;
		while(i<playerCards.size()){
			System.out.println(playerCards.get(i)+"  "+i);
			i++;
		}
	}
}
