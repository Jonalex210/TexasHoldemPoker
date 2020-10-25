/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texasholdempoker;

import java.util.Arrays;

/**
 *
 * @author Mohmmed Mohammed
 */
public class Card {

    /*
    * sortArr takes array of integer representing the Poker Hand, then it order
    * them regarding to its position as element%13
    *
    */
    public int[] sortArr(int[] hand) {// sortArr
        int min = hand[0] % 13;
        int index = 0;
        int temp;
        for (int i = 0; i < hand.length; i++) {
            index = i;
            min = hand[i] % 13;
            for (int x = i; x < hand.length; x++) {
                if (hand[x] % 13 < min) {
                    min = hand[x] % 13;
                    index = x;
                }
            } // end of for
            temp = hand[i];
            hand[i] = hand[index];
            hand[index] = temp;

        } // end of for
        return hand;
    }// end of sortArr method


    public boolean isSameKind(int[] hand) {
        int cont;
        for (int i = 0; i < 4; i++) {
            cont = 0;
            for (int j = 0; j < hand.length; j++) {
                if (hand[j] / 13 == i)
                    cont++;
            } // end of for loop
            if (cont == 5)
                return true;
        } // end of for loop

        return false;
    }// end of isSameKind method


    

    /*
    * identifyHand takes integer array representing the Hand, then determine the
    * kind of hand and return it, as String
    */
    public String identifyHand(int[] hand) {
        
        boolean isItThreeOfKind = false;
        boolean isItStraight = true;
        boolean isItStraightFlush = true;
        int isItFullHouse = 0;
        int[] fourOrFullHouse = new int[5];
        int count = 10;
        
        for (int i = 0, j = 0; i < hand.length - 1; i++) {
            if (!(hand[i] == (hand[i + 1] - 1)))
                isItStraightFlush = false;

            if (!(hand[i] % 13 == ((hand[i + 1] % 13) - 1)))
                isItStraight = false;

            if (hand[i] % 13 == hand[i + 1] % 13) {
                isItFullHouse++;
                fourOrFullHouse[j++] = hand[i];

            } else
            count = i;
        } // end of for loop

        if (isItStraightFlush || (isSameKind(hand) && isItStraigthAceTop(hand))) {
            if (Royal_Flush(hand)) {
                return "Royal Flush";
            }
            return "Striaght Flush";
        } // end of if
        else if (isItFullHouse == 3) {
            if (count == 0 || count == 3)
                return "Four of a kind";
            else
                return "Full House";
        } // end of if
        else if (isSameKind(hand))
            return "Flush";
        else if (isItStraight || isItStraigthAceTop(hand))
            return "Straight";
        else {
            boolean co = false;
            int forTwo = 0;
            int ofSuit[] = new int[2];
            for (int i = 0, j = 0; i < hand.length - 1; i++) {
                if (hand[i] % 13 == hand[i + 1] % 13) {
                if (co)
                    isItThreeOfKind = true;

                ofSuit[j++] = hand[i];
                co = true;
                forTwo++;
                } // end of if
                else
                    co = false;
            } // end of for loop
            if (isItThreeOfKind)
                return "Three of kind";
            else if (forTwo == 2)
                return "Two Pairs";
            else if (forTwo == 1)
                return "One Pair";
            else
                return "High Card";

        } // end of else

    }

    //Royal_Flush method it takes an array of hand and it return boolean.

    public boolean Royal_Flush(int[] hand) {
        sortArr(hand);
        int[] h = { 0, 9, 10, 11, 12 };
        int[] d = { 13, 22, 23, 24, 25 };
        int[] c = { 26, 35, 36, 37, 38 };
        int[] s = { 39, 48, 49, 50, 51 };

        if (Arrays.equals(hand, h) || Arrays.equals(hand, d) || Arrays.equals(hand, c) || Arrays.equals(hand, s))
            return true;
        return false;

    }

    /*
    * isItStraigthAceTop takes an array of integer "hand", checks the Straight case
    * when the Ace on Top, and return boolean type regard to that
    */

    public boolean isItStraigthAceTop(int[] hand) {

        int han[] = new int[5];

        // for loop copy hand into new array, whenever find Ace card, change its position
        // to the king position, else will push all the card one number down

        for (int i = 0; i < hand.length; i++) {
            if (hand[i] % 13 == 0)
                han[i] = hand[i] + 12;
            else
                han[i] = hand[i] - 1;
        } // end of for loop

        sortArr(han);

        // then try to determine is the new array is straight or not
        for (int i = 0; i < han.length - 1; i++)
            if (han[i] % 13 != han[i + 1] % 13 - 1)
                return false;

        return true;
    }// end of isItStraigthAceTop method

    // determineRankOfCard takes one card as int, determine its Rank, then return it
    // as String type

    public String determineRankOfCard(int card) {
        String rank = "";
        switch (card % 13) {
            case 0: {
            rank = "Ace";
            break;
            }
            case 1: {
            rank = "2";
            break;
            }
            case 2: {
            rank = "3";
            break;
            }
            case 3: {
            rank = "4";
            break;
            }
            case 4: {
            rank = "5";
            break;
            }
            case 5: {
            rank = "6";
            break;
            }
            case 6: {
            rank = "7";
            break;
            }
            case 7: {
            rank = "8";
            break;
            }
            case 8: {
            rank = "9";
            break;
            }
            case 9: {
            rank = "10";
            break;
            }
            case 10: {
            rank = "Jack";
            break;
            }
            case 11: {
            rank = "Queen";
            break;
            }
            case 12: {
            rank = "King";
            break;
            }
            default:
            rank = "wrong choice";
        }// end of switch
        return rank;
    }// end of determineRankOfCard method

    /*
    * determineSuit takes one card as integer, determine its Suit, then return it
    * as String type
    */

    public String determineSuit(int card) {
        String suit = "";
        switch (card / 13) {// switch
            case 0: {
            suit = "hearts";
            break;
            }
            case 1: {
            suit = "diamonds";
            break;
            }
            case 2: {
            suit = "spades";
            break;
            }
            case 3: {
            suit = "clubs";
            break;
            }
            default:
            suit = "wrong choice";
        }// end of switch
        return suit;
    }
    
    
    
    
    public int[] hand(int[] towCards, int[] fiveCards) {
        Card ca = new Card();
        int[] bestHand = new int[5];
        String[] compare = new String[10];
        // 123
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[0];
        bestHand[3] = fiveCards[1];
        bestHand[4] = fiveCards[2];
        int[] bestHand123 = Arrays.copyOf(bestHand,bestHand.length);
        ca.sortArr(bestHand);
        String compare1 = ca.identifyHand(bestHand);
        compare[0] = compare1;

        // 124
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[0];
        bestHand[3] = fiveCards[1];
        bestHand[4] = fiveCards[3];
        int[] bestHand124 = Arrays.copyOf(bestHand,bestHand.length);
        ca.sortArr(bestHand);
        String compare2 = ca.identifyHand(bestHand);
        compare[1] = compare2;

        // 125
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[0];
        bestHand[3] = fiveCards[1];
        bestHand[4] = fiveCards[4];
        int[] bestHand125 = Arrays.copyOf(bestHand,bestHand.length);
        ca.sortArr(bestHand);
        String compare3 = ca.identifyHand(bestHand);
        compare[2] = compare3;

        // 134
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[0];
        bestHand[3] = fiveCards[2];
        bestHand[4] = fiveCards[3];
        int[] bestHand134 = Arrays.copyOf(bestHand,bestHand.length);
        ca.sortArr(bestHand);
        String compare4 = ca.identifyHand(bestHand);
        compare[3] = compare4;

        // 135
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[0];
        bestHand[3] = fiveCards[2];
        bestHand[4] = fiveCards[4];
        int[] bestHand135 = Arrays.copyOf(bestHand,bestHand.length);
        ca.sortArr(bestHand);
        String compare5 = ca.identifyHand(bestHand);
        compare[4] = compare5;

        // 145
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[0];
        bestHand[3] = fiveCards[3];
        bestHand[4] = fiveCards[4];
        int[] bestHand145 = Arrays.copyOf(bestHand,bestHand.length);
        ca.sortArr(bestHand);
        String compare6 = ca.identifyHand(bestHand);
        compare[5] = compare6;

        // 234
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[1];
        bestHand[3] = fiveCards[2];
        bestHand[4] = fiveCards[3];
        int[] bestHand234 = Arrays.copyOf(bestHand,bestHand.length);
        ca.sortArr(bestHand);
        String compare7 = ca.identifyHand(bestHand);
        compare[6] = compare7;

        // 235
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[1];
        bestHand[3] = fiveCards[2];
        bestHand[4] = fiveCards[4];
        int[] bestHand235 = Arrays.copyOf(bestHand,bestHand.length);
        ca.sortArr(bestHand);
        String compare8 = ca.identifyHand(bestHand);
        compare[7] = compare8;

        // 245
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[1];
        bestHand[3] = fiveCards[3];
        bestHand[4] = fiveCards[4];
        int[] bestHand245 = Arrays.copyOf(bestHand,bestHand.length);
        ca.sortArr(bestHand);
        String compare9 = ca.identifyHand(bestHand);
        compare[8] = compare9;

        // 345
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[2];
        bestHand[3] = fiveCards[3];
        bestHand[4] = fiveCards[4];
        int[] bestHand345 = Arrays.copyOf(bestHand,bestHand.length);
        ca.sortArr(bestHand);
        String compare10 = ca.identifyHand(bestHand);
        compare[9] = compare10;

        int counter = 10;
        int valueofi = 10;
        for (int i = 0; i < 10; i++) {

            if (compare[i].equals("Royal Flush")) {
                counter = 1;
                valueofi=i;
           // return bestHand123;
             
            } else if (compare[i].equals("Striaght Flush")) {
                    if (counter > 2){
                    counter = 2;
                    valueofi=i;
                    }

            } else if (compare[i].equals("Four of a kind")) {
                    if (counter > 3){
                        counter = 3;
                        valueofi=i;
                    }
            } else if (compare[i].equals("Full House")) {
                    if (counter > 4){
                        counter = 4;
                        valueofi=i;
                    }
            }else if (compare[i].equals("Flush")) {
                    if (counter > 5){
                        counter = 5;                  
                        valueofi=i;
                    }
            } else if (compare[i].equals("Straight")) {
                    if (counter > 6){
                        counter = 6;                  
                        valueofi=i;
                    }
            } else if (compare[i].equals("Three of kind")) {
                    if (counter > 7){
                        counter = 7;                    
                        valueofi=i;
                    }
            } else if (compare[i].equals("Two Pairs")) {
                    if (counter > 8){
                        counter = 8;                    
                        valueofi=i;
                    }
            } else if (compare[i].equals("One Pair")) {
                    if (counter > 9){
                        counter = 9;
                        valueofi=i;
                    }

            } else {
                    counter = 10;
                    valueofi=10;
                     
            }
        }
        
        
        
        switch(valueofi){
                case 0:
                    return ca.sortArr(bestHand123);
                case 1:
                    return ca.sortArr(bestHand124);
                case 2:
                    return ca.sortArr(bestHand125);
                case 3:
                    return ca.sortArr(bestHand134);
                case 4:
                    return ca.sortArr(bestHand135);
                case 5:
                    return ca.sortArr(bestHand145);
                case 6: 
                    return ca.sortArr(bestHand234);
                case 7:
                    return ca.sortArr(bestHand235);
                case 8:
                    return ca.sortArr(bestHand245);
                default: 
                    return ca.sortArr(bestHand345);  
                    
        }
        
    }
    
    
     public String identifyhandOfHouse(int[] towCards, int[] fiveCards) {
        Card ca = new Card();
        int[] bestHand = new int[5];
        String[] compare = new String[10];
        // 123
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[0];
        bestHand[3] = fiveCards[1];
        bestHand[4] = fiveCards[2];
        int[] bestHand123 = Arrays.copyOf(bestHand,bestHand.length);
        ca.sortArr(bestHand);
        String compare1 = ca.identifyHand(bestHand);
        compare[0] = compare1;

        // 124
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[0];
        bestHand[3] = fiveCards[1];
        bestHand[4] = fiveCards[3];
        int[] bestHand124 = Arrays.copyOf(bestHand,bestHand.length);
        ca.sortArr(bestHand);
        String compare2 = ca.identifyHand(bestHand);
        compare[1] = compare2;

        // 125
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[0];
        bestHand[3] = fiveCards[1];
        bestHand[4] = fiveCards[4];
        int[] bestHand125 = Arrays.copyOf(bestHand,bestHand.length);
        ca.sortArr(bestHand);
        String compare3 = ca.identifyHand(bestHand);
        compare[2] = compare3;

        // 134
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[0];
        bestHand[3] = fiveCards[2];
        bestHand[4] = fiveCards[3];
        int[] bestHand134 = Arrays.copyOf(bestHand,bestHand.length);
        ca.sortArr(bestHand);
        String compare4 = ca.identifyHand(bestHand);
        compare[3] = compare4;

        // 135
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[0];
        bestHand[3] = fiveCards[2];
        bestHand[4] = fiveCards[4];
        int[] bestHand135 = Arrays.copyOf(bestHand,bestHand.length);
        ca.sortArr(bestHand);
        String compare5 = ca.identifyHand(bestHand);
        compare[4] = compare5;

        // 145
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[0];
        bestHand[3] = fiveCards[3];
        bestHand[4] = fiveCards[4];
        int[] bestHand145 = Arrays.copyOf(bestHand,bestHand.length);
        ca.sortArr(bestHand);
        String compare6 = ca.identifyHand(bestHand);
        compare[5] = compare6;

        // 234
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[1];
        bestHand[3] = fiveCards[2];
        bestHand[4] = fiveCards[3];
        int[] bestHand234 = Arrays.copyOf(bestHand,bestHand.length);
        ca.sortArr(bestHand);
        String compare7 = ca.identifyHand(bestHand);
        compare[6] = compare7;

        // 235
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[1];
        bestHand[3] = fiveCards[2];
        bestHand[4] = fiveCards[4];
        int[] bestHand235 = Arrays.copyOf(bestHand,bestHand.length);
        ca.sortArr(bestHand);
        String compare8 = ca.identifyHand(bestHand);
        compare[7] = compare8;

        // 245
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[1];
        bestHand[3] = fiveCards[3];
        bestHand[4] = fiveCards[4];
        int[] bestHand245 = Arrays.copyOf(bestHand,bestHand.length);
        ca.sortArr(bestHand);
        String compare9 = ca.identifyHand(bestHand);
        compare[8] = compare9;

        // 345
        bestHand[0] = towCards[0];
        bestHand[1] = towCards[1];
        bestHand[2] = fiveCards[2];
        bestHand[3] = fiveCards[3];
        bestHand[4] = fiveCards[4];
        int[] bestHand345 = Arrays.copyOf(bestHand,bestHand.length);
        ca.sortArr(bestHand);
        String compare10 = ca.identifyHand(bestHand);
        compare[9] = compare10;

        int counter = 10;
        int valueofi = 10;
        for (int i = 0; i < 10; i++) {

            if (compare[i].equals("Royal Flush")) {
                counter = 1;
                valueofi=i;
                return "Royal Flush";
             
            } else if (compare[i].equals("Striaght Flush")) {
                    if (counter > 2){
                    counter = 2;
                    valueofi=i;
                    }

            } else if (compare[i].equals("Four of a kind")) {
                    if (counter > 3){
                        counter = 3;
                        valueofi=i;
                    }
            } else if (compare[i].equals("Full House")) {
                    if (counter > 4){
                        counter = 4;
                        valueofi=i;
                    }
            }else if (compare[i].equals("Flush")) {
                    if (counter > 5){
                        counter = 5;                  
                        valueofi=i;
                    }
            } else if (compare[i].equals("Straight")) {
                    if (counter > 6){
                        counter = 6;                  
                        valueofi=i;
                    }
            } else if (compare[i].equals("Three of kind")) {
                    if (counter > 7){
                        counter = 7;                    
                        valueofi=i;
                    }
            } else if (compare[i].equals("Two Pairs")) {
                    if (counter > 8){
                        counter = 8;                    
                        valueofi=i;
                    }
            } else if (compare[i].equals("One Pair")) {
                    if (counter > 9){
                        counter = 9;
                        valueofi=i;
                    }

            } else {
                    counter = 10;
                    valueofi=10;
                     
            }
        }
        
        
        
        switch(counter){
                case 1:
                    return "Royal Flush";
                case 2:
                    return "Striaght Flush";
                case 3:
                    return "Four of a kind";
                case 4:
                    return "Full House";
                case 5:
                    return "Flush" ;
                case 6:
                    return "Straight";
                case 7: 
                    return "Three of kind";
                case 8:
                    return "Two Pairs";
                case 9:
                    return "one Pair";
                default: 
                    return "High cards";  
                    
        }
     }
     
    public String identifyHouselast(int counter){
        
            if (counter == 1)
                return "Royal Flush";
            else if (counter == 2)
                return "Striaght Flush";
            else if (counter == 3)
                return "Four of a kind";
            else if (counter == 4)
                return "Full House";
            else if (counter == 5)
                return "Flush";
            else if (counter == 6)
                return "Straight";
            else if (counter == 7)
                return "Three of kind";
            else if (counter == 8)
                return "Two Pairs";
            else if (counter == 9)
                return "One Pair";
            else  
                return "High Card";
       
   
   
    }


    public static void main(String[] args) {// main method

        // int[] c = { 9, 0 };
        // int[] d = { 0, 9, 10, 11, 12 };
        // System.out.println(bestHand(c, d));
        //
        //StdDraw.setXscale(0, 34);
        //StdDraw.setYscale(0, 35);
        int[] testHand = { 0, 9, 10, 11, 12 };// Royal Flush----1
        // int[] testHand = { 0, 1, 2, 3, 4 };// straight flush---2
        // int[] testHand = { 35, 32, 34, 36, 33 };// straight flush---2
        // int[] testHand = { 0, 0, 13, 13, 5 };// four of kind--3
        // int[] testHand = { 13, 13, 0, 2, 2 };// full house--4
        // int[] testHand = { 2, 4, 0, 8, 12 };// Flush ---5
        // int[] testHand = { 0, 4, 14, 29, 15 };// straight---6
        // int[] testHand = { 0, 40, 48, 26, 13 };//three of kind---7
        // int[] testHand = { 35, 1, 48, 22, 13 };//three of kind---7

        // int[] testHand = { 0, 1, 14, 23, 13 };// tow pair ----8
        // int[] testHand = { 0, 40, 48, 23, 13 };// one pair ----9
        // int[] testHand = { 0, 35, 33, 37, 30 };// high card----10

        //drawHand(testHand);// This will draw corresponding images in the window
        //drawHandText(testHand);// This will draw names of each card under the images
        //drawIdentifiedHand(testHand);// This will print what hand you have in the window
    }// end of main

}// end of PokerTesterWindow class
    
    
    
    
    
    
    
    
    

