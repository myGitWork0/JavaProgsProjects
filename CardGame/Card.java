package Practise1;

public class Card {
	public String[] cardType={"spades","cloves","hearts","diamonds"};
	private String cardName;
	public String[] cardValue={"1","2","3","4","5","6","7","8","9","10","11","12","13"};
	private String cardV;
	public String getCardValue(){
		return cardV;
	}
	public void CardSetting(String cardValue,String cardName){
		this.cardV=cardValue;
		this.cardName=cardName;
	}
	public String getCardName(){
		return cardName;
	}
	public String toString(){
		return cardV+" of "+cardName;
	}
}
	
