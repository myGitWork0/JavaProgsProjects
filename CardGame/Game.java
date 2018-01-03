package Practise1;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitialDeck id=new InitialDeck();
		Player p1=new Player();
		Player p2=new Player();
		int j=52;
		while(j>0){
			int r=(int)(Math.random()*j);
			j--;
			if(j%2==0){
				p1.playerCardsAdd(id.removeCard(r));
			}
			else{
				p2.playerCardsAdd(id.removeCard(r));
			}
		}
		System.out.println("Enter 1 to print your cards \nEnter 2 to print Current Cards in the Deck\nEnter 3 to send the card to the deck");
		Deck d=new Deck();
		p1.printPlayerCards();
		Scanner sc=new Scanner(System.in);
		int n=0;
			while(p1.playerCards.size()!=0 && p2.playerCards.size()!=0){
				if(n%2==0){
					int input=sc.nextInt();
					Card ca=p1.playerCardsDiscard(input);
					if(d.addDeck(ca)==1){
						System.out.println("_________________________player 1 cards__________________________________");
						p1.printPlayerCards();
						System.out.println("___________________________________________________________");
					}
					else{	
						System.out.println("Invalid Card");
					}
				}
				else{
					int input=sc.nextInt();
					Card ca=p2.playerCardsDiscard(input);
					if(d.addDeck(ca)==1){
						System.out.println("___________________________Player 2 cards________________________________");
						p2.printPlayerCards();
						System.out.println("___________________________________________________________");
					}
					else{	
						System.out.println("Invalid Card");
					}
				}
				
			}	
			if(p1.playerCards.size()==0){
				System.out.println("Player one Wins");
			}
			else{
				System.out.println("Player two Wins");
			}
	}
}
