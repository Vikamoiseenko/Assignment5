package com.vmoiseenko.Assignment5;

import java.util.ArrayList;
import java.util.Collections;


public class cardArray {
	
	private ArrayList<Card> deck;
	public cardArray(){
		deck=new ArrayList<Card>();
		populateDesk();
	}

	public ArrayList<Card> getDeck() {
		shuffle(deck);
		return deck;
	}

	public void setDeck(ArrayList<Card> deck) {
		this.deck = deck;
	}

	private void populateDesk(){
		for(int i =1; i<5; i++){
			for(int j = 1; j<14; j++){
			Card c = new Card();
			
		switch(i){
		case 1: c.setSuit("Hearts");
		break;
		case 2:c.setSuit("Dimond");
		break;
		case 3:c.setSuit("Spades");
		break;
		default: c.setSuit("Clabs");
		break;
		}
		
			c.setValue(j);
			deck.add(c);
		}
	}
	}
	private void shuffle(ArrayList<Card> deck){
		Collections.shuffle(deck);
		
	}
			
	
}

