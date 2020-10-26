/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texasholdempoker;


/**
 *
 * @author maste
 */
public class Main {

    /**
     * @param args the command line arguments
     */


   
   
    public static void main(String[] args) {
        StartPage window = new StartPage();
        window.setVisible(true);
       
        Dealer de = new Dealer();
        GamePage gam = new GamePage();
        int counter = 0;
        if(counter == 0){
        int oneDestributedCard =de.distributedCards(de.shuffleArray(de.getDeck()));
        int[] kdestributedDeck =de.shuffleArray(de.getDeck());
        kdestributedDeck = de.shuffleArray(de.getDeck());
        for(int i =0; i<kdestributedDeck.length;i++){
            System.out.println(kdestributedDeck[i]+" ");
        }
       
    }
    }
}
