package Practise1;

import java.util.ArrayList;

public class InitialDeck {
	private static ArrayList<Card> a=new ArrayList<Card>();
	private Card c;
	public InitialDeck(){
		for(int i=0;i<13;i++){
			for(int j=0;j<4;j++){
				c=new Card();
				c.CardSetting(c.cardValue[i], c.cardType[j]);
				a.add(c);
			}
		}
	}
	public void Print(){
		int i=0;
		while(i<a.size()){
			System.out.println(a.get(i));
			i++;
		}
	}
	public Card removeCard(int i){
		Card c=a.get(i);
		a.remove(i);
		return c;
	}
}
