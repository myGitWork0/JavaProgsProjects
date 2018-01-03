package Practise1;

import java.util.*;

public class Deck {
	private Card[] hearts=new Card[13];
	private Card[] spades=new Card[13];
	private Card[] cloves=new Card[13];
	private Card[] diamonds=new Card[13];
	private int lowerHearts=-1;
	private int higherHearts=-1;
	private int lowerSpades=-1;
	private int higherSpades=-1;
	private int lowerCloves=-1;
	private int higherCloves=-1;
	private int lowerDiamonds=-1;
	private int higherDiamonds=-1;
	public int addDeck(Card c){
		
		if((lowerHearts==-1 && higherHearts ==-1 && Integer.parseInt(c.getCardValue())!=7)&&( lowerSpades==-1 && higherSpades ==-1 && Integer.parseInt(c.getCardValue())!=7)&&(lowerCloves==-1 && higherCloves ==-1 && Integer.parseInt(c.getCardValue())!=7)&&(lowerDiamonds==-1 && higherDiamonds ==-1 && Integer.parseInt(c.getCardValue())!=7)){
			return -1;
		}
		else if(Integer.parseInt(c.getCardValue())==7){
			if(c.getCardName().equals("hearts")){
				lowerHearts=7;
				higherHearts=7;
				hearts[7]=c;
				return 1;
			}
			else if(c.getCardName().equals("spades")){
				lowerSpades=7;
				higherSpades=7;
				spades[7]=c;
				return 1;
			}
			else if(c.getCardName().equals("cloves")){
				lowerCloves=7;
				higherCloves=7;
				cloves[7]=c;
				return 1;
			}
			else if(c.getCardName().equals("diamonds")) {
				lowerDiamonds=7;
				higherDiamonds=7;
				diamonds[7]=c;
				return 1;
			}
		}
		else if(c.getCardName().equals("hearts")){
			int r=Arrays.asList(c.cardValue).indexOf(c.getCardValue());
			if(r==lowerHearts-2){
				lowerHearts=lowerHearts-1;
				hearts[lowerHearts]=c;
				return 1;
			}
			else if(r==higherHearts){
				higherHearts=higherHearts+1;
				hearts[higherHearts]=c;
				return 1;
			}
			else return -1;
		}
		else if(c.getCardName().equals("spades")){
			int r=Arrays.asList(c.cardValue).indexOf(c.getCardValue());
			if(r==lowerSpades-2){
				lowerSpades=lowerSpades-1;
				spades[lowerSpades]=c;
				return 1;
			}
			else if(r==higherSpades){
				higherSpades=higherSpades+1;
				spades[higherSpades]=c;
				return 1;
			}
			else return -1;
		}
		else if(c.getCardName().equals("cloves")){
			int r=Arrays.asList(c.cardValue).indexOf(c.getCardValue());
			if(r==lowerCloves-2){
				lowerCloves=lowerCloves-1;
				cloves[lowerCloves]=c;
				return 1;
			}
			else if(r==higherCloves){
				higherCloves=higherCloves+1;
				cloves[higherCloves]=c;
				return 1;
			}
			else return -1;
		}
		else if(c.getCardName().equals("diamonds")){
			int r=Arrays.asList(c.cardValue).indexOf(c.getCardValue());
			if(r==lowerDiamonds-2){
				lowerDiamonds=lowerDiamonds-1;
				diamonds[lowerDiamonds]=c;
				return 1;
			}
			else if(r==higherDiamonds){
				higherDiamonds=higherDiamonds+1;
				diamonds[higherDiamonds]=c;
				return 1;
			}
			else return -1;
		}
		return -1;
	}
	public void printDeck(){
		//Arrays.asList(hearts)
		if(lowerHearts!=-1 && higherHearts!=-1)
		for(int i=lowerHearts;i<=higherHearts;i++){
			
			System.out.println(hearts[i].toString());
		}
		if(lowerSpades!=-1 && higherSpades!=-1)
		for(int i=lowerSpades;i<=higherSpades;i++){
			System.out.println(lowerSpades+" ");
			System.out.println(spades[i].toString());
		}
		if(lowerCloves!=-1 && higherCloves!=-1)
		for(int i=lowerCloves;i<=higherCloves;i++){
			System.out.println(cloves[i].toString());
		}
		if(lowerDiamonds!=-1 && higherDiamonds!=-1)
		for(int i=lowerDiamonds;i<=higherDiamonds;i++){
			System.out.println(diamonds[i].toString());
		}
	}
}
