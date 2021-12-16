package dsa.codingChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;




public class BlackJackConsoleGame {
    
    public DeckOfCards cardDeck;
    
    
    public static void main(String args[]){
        
        System.out.println("Let's start BlackJack!!!");
        
        DeckOfCards cardDeck = new DeckOfCards();
        cardDeck.createDeck();
        cardDeck.shuffleDeck();
        
        //player object
        DeckOfCards player = new DeckOfCards();
        //dealer object
        DeckOfCards dealer = new DeckOfCards();
        
        Scanner scanner = new Scanner(System.in);              
        
        
        while(true){
            
            player.DrawCard(cardDeck);
            player.DrawCard(cardDeck);
            
            dealer.DrawCard(cardDeck);
            dealer.DrawCard(cardDeck);
            
            System.out.println("Cards in your hands "+player.printDeck());
            System.out.println("Cards in dealer hands "+dealer.printDealerDeck()+" and one hidden card!");
            
            //hit or stay [1] hit [2] stay
            System.out.println();
            System.out.println("Choose hit or stay [1] hit [2] stay >>> ");
            
            int option=-1;
            if(!scanner.hasNextInt()){
                System.out.println("Invalid Option! Only interger iput allowed! Game Terminated!");
                
                break;
            }else{
                option = scanner.nextInt();
            }
             
            
                    
            if(!(option==2|| option==1)){
                System.out.println("Invalid Option!  Game Terminated!");
                break;
            }            
            
            
            if(option==1){
                player.DrawCard(cardDeck);         
                
                System.out.println("Cards in your hands "+player.printDeck());
                 
                if(player.getCardValue()>21){
                    System.out.println("You are Bust!");
                    //break;
                }
            }           
            
            if(option==2){
                //break;                
            }
            
           
            
            System.out.println("Player cards value : "+player.getCardValue());
                
            
            if(dealer.getCardValue()<17){
                System.out.println("Cards in Dealer hands "+dealer.printDeck());
                System.out.println("Dealer is less than 17, so one more draw for dealer");
                System.out.println();
                dealer.DrawCard(cardDeck);
                
                System.out.println("Cards in Dealer hands "+dealer.printDeck());
                
                System.out.println("Dealer cards value : "+dealer.getCardValue());      
            }else{
                System.out.println("Cards in Dealer hands "+dealer.printDeck());
                System.out.println("Dealer cards value : "+dealer.getCardValue());  
            }
            
            if(dealer.getCardValue()>21){
                System.out.println("Dealer Bust! You won!");
            }else if(player.getCardValue() > dealer.getCardValue()){
                System.out.println("You Won!");               
            }else if(player.getCardValue() < dealer.getCardValue()){
                System.out.println("Dealer Won!");   
            }else if(player.getCardValue() == dealer.getCardValue()){
                System.out.println("Its a Draw!");   
            }
            
            
            
            
            System.out.println("Do you want to play agian ? Choose, Yes [1] No [any number]  >>> ");
            //int playAgain  = scanner.nextInt();
            
            int playAgain=-1;
            if(!scanner.hasNextInt()){
                System.out.println("Invalid Option! Only interger iput allowed! Game Terminated!");                
                break;
            }else{
                playAgain = scanner.nextInt();
            }
            
            if(playAgain==1){
               player.restDeck();
               dealer.restDeck();
               cardDeck.restratGame();
            } else{
                System.out.println("Game Over!"); 
                 break;
            }
            
        }
        
        
    }
    
    
    public void startGame(){
        
    }
    
    //Deck Class
    static class DeckOfCards {
        
        ArrayList<Card> allCards = new ArrayList<>();
        HashMap<String,Integer> cardValue = new HashMap<>();
        String[] suitsList = {"clubs","diamonds","hearts","spades"};
            
        DeckOfCards(){
            
            //card data
            cardValue.put("ACE",1);
            cardValue.put("TWO",2);
            cardValue.put("THREE",3);
            cardValue.put("FOUR",4);
            cardValue.put("FIVE",5);
            cardValue.put("SIX",6);
            cardValue.put("SEVEN",7);
            cardValue.put("EIGHT",8);
            cardValue.put("NINE",9);
            cardValue.put("TEN",10);
            cardValue.put("JACK",10);
            cardValue.put("QUEEN",10);
            cardValue.put("KING",10);
            
            
        }
        
        //prints deck
        String printDeck(){
             return allCards.toString();             
        }
        
        //print dealer deck initially by hiding one card
        String printDealerDeck(){            
             return allCards.get(0).toString();             
        }

        //creates deck
        void createDeck (){            
            int suitsSize = suitsList.length;
            for(int i=0;i<suitsSize;i++){                
                for(String cardName : cardValue.keySet()){
                    allCards.add(new Card(cardName, cardValue.get(cardName), suitsList[i]));
                    
                }     
            }
           
        }
        
        //shuffles the deck
        void shuffleDeck(){ 
            Random rand = new Random();
            for(int i=0;i<30;i++){       
                int randomOne = rand.nextInt(50);;
                int randomTwo = rand.nextInt(50);;
                Collections.swap(allCards, randomOne, randomTwo);                 
            }
        }
        
        //reset the game and create deck again
        void restratGame(){
            allCards.clear();
            createDeck();
            shuffleDeck();
        }
        
        void restDeck(){
            allCards.clear();
        }
        
        //returns the card with respect to position
        Card getCard(int index){
            return allCards.get(0);
        }
        
        //removes the card with respect to position
        void removeFromDeck (int index){
            allCards.remove(index);
        }
        
        //draw card  - add the current object and remove from master deck
        void DrawCard(DeckOfCards fromDeck){
            allCards.add(fromDeck.getCard(0));
            fromDeck.removeFromDeck(0);            
        }
        
        //return total card value for object
        int getCardValue (){
            int totalValue = 0;
            for(Card card : allCards){
                if(cardValue.containsKey(card.name) && !card.name.equalsIgnoreCase("ACE")){
                    totalValue+=cardValue.get(card.name);
                }                
            }
            //For ace calculation
            for(Card card : allCards){               
                if(cardValue.containsKey(card.name) && card.name.equalsIgnoreCase("ACE")){
                    if(totalValue+11 > 21 ){
                        totalValue+=1;
                    }else{
                        totalValue+=11;
                    }
                }
            }
            
            return totalValue;
        }
        
    }
    
    //card class
    static class Card {
        
        String name;
        int value;
        String suits;

        public Card(String name, int value, String suits) {
            this.name = name;
            this.value = value;
            this.suits = suits;
        }

        public Card() {
        }
        
        

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getSuits() {
            return suits;
        }

        public void setSuits(String suits) {
            this.suits = suits;
        }

        @Override
        public String toString() {
            return suits.toUpperCase()+"-"+name.toUpperCase();
        }
        
        
        
        
    }
    
    
}
