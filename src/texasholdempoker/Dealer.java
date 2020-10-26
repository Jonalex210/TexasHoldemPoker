/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texasholdempoker;

import java.util.Random;


/**
 *
 * @author mohammed
 */
public class Dealer {
    /*
    * bestHand method it takes tow arrays first one have tow cards which is the
    * player cards and five cards which the river, and its determine the best chose
    * of house cards which its five cards from seven cards which is the total of
    * both arrays from ten possible choices.it return String which the name of the
    * hand.
    */
    public int[] deckOfCards = new int[51];
    public int[] getDeck(){
        for(int i =0; i <51;i++){
            deckOfCards[i] = i;
        }
        return deckOfCards;
    
    }

    public int bestHand(int[] towCards, int[] fiveCards) {
        Card ca = new Card();
        int[] bestHand = new int[5];
        String[] compare = new String[10];
        // 123
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[0];
        bestHand[3] = fiveCards[1];
        bestHand[4] = fiveCards[2];
        ca.sortArr(bestHand);
        String compare1 = ca.identifyHand(bestHand);
        compare[0] = compare1;

        // 124
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[0];
        bestHand[3] = fiveCards[1];
        bestHand[4] = fiveCards[3];
        ca.sortArr(bestHand);
        String compare2 = ca.identifyHand(bestHand);
        compare[1] = compare2;

        // 125
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[0];
        bestHand[3] = fiveCards[1];
        bestHand[4] = fiveCards[4];
        ca.sortArr(bestHand);
        String compare3 = ca.identifyHand(bestHand);
        compare[2] = compare3;

        // 134
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[0];
        bestHand[3] = fiveCards[2];
        bestHand[4] = fiveCards[3];
        ca.sortArr(bestHand);
        String compare4 = ca.identifyHand(bestHand);
        compare[3] = compare4;

        // 135
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[0];
        bestHand[3] = fiveCards[2];
        bestHand[4] = fiveCards[4];
        ca.sortArr(bestHand);
        String compare5 = ca.identifyHand(bestHand);
        compare[4] = compare5;

        // 145
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[0];
        bestHand[3] = fiveCards[3];
        bestHand[4] = fiveCards[4];
        ca.sortArr(bestHand);
        String compare6 = ca.identifyHand(bestHand);
        compare[5] = compare6;

        // 234
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[1];
        bestHand[3] = fiveCards[2];
        bestHand[4] = fiveCards[3];
        ca.sortArr(bestHand);
        String compare7 = ca.identifyHand(bestHand);
        compare[6] = compare7;

        // 235
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[1];
        bestHand[3] = fiveCards[2];
        bestHand[4] = fiveCards[4];
        ca.sortArr(bestHand);
        String compare8 = ca.identifyHand(bestHand);
        compare[7] = compare8;

        // 245
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[1];
        bestHand[3] = fiveCards[3];
        bestHand[4] = fiveCards[4];
        ca.sortArr(bestHand);
        String compare9 = ca.identifyHand(bestHand);
        compare[8] = compare9;

        // 345
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[2];
        bestHand[3] = fiveCards[3];
        bestHand[4] = fiveCards[4];
        ca.sortArr(bestHand);
        String compare10 = ca.identifyHand(bestHand);
        compare[9] = compare10;

        int counter = 10;
        for (int i = 0; i < 10; i++) {

            if (compare[i].equals("Royal Flush")) {
                
                counter = 1;
                return 1;
            } else if (compare[i].equals("Striaght Flush")) {
                   if(counter>2){
                         counter = 2;
                   }

            } else if (compare[i].equals("Four of a kind")) {
                if(counter>3){
                     counter = 3;
                }
                        

            } else if (compare[i].equals("Full House")) {
                if(counter>4){
                     counter = 4;
                }
                   

            }

            else if (compare[i].equals("Flush")) {
                if(counter>5){
                     counter = 5;
                }
                      

            } else if (compare[i].equals("Straight")) {
                   if(counter>6){
                        counter = 6;
                   }

            } else if (compare[i].equals("Three of kind")) {
                if(counter>7){
                     counter = 7;
                }
                        

            } else if (compare[i].equals("Two Pairs")) {
                   if(counter>8){
                        counter = 8;
                   }

            } else if (compare[i].equals("One Pair")) {
                if(counter>9){
                    counter = 9;
                }
                       

            } else {
                if(counter == 10)
                    counter =  10;
            }
        }
        return counter;
                    
       

    }
    
    public String identifyWinner(int playerHand, int ComputerHand){
        if(playerHand < ComputerHand){
            return "The Winner is Player";
        }
        if(playerHand > ComputerHand){
            return "The Winner is Computer";
        }
        return "Draw";
    
    }
    
    public int[] shuffleArray(int[] array){

        int position, temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--){
        
            position = random.nextInt(i + 1);
            temp = array[position];
            array[position] = array[i];
            array[i] = temp;
        }
        return array;
    }
    
    public int distributedCards(int[] shuffledArray){
       
        return shuffledArray[0];
    }
    public int[] shifftingArray(int[] shuffledArray){
        int temp =0;
        for(int i=0; i<shuffledArray.length;i++){
            shuffledArray[i] = shuffledArray[i+1];
            temp = shuffledArray[i];
            shuffledArray[1] = shuffledArray[i+1];
            shuffledArray[i+1] = temp;
        }
        return shuffledArray;
    }   

    
    
}
