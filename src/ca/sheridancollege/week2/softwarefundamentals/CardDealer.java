/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 * @modifier Lakshay Mahajan
 * @Student Number=991631011
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
    }
    Card myObject=new Card();
    
    myObject.setSuit("Hearts");
    System.out.println(myObject.getSuit());
    System.out.println(myObject.getValue());
    
    Card threeObject=new Card();
    
    
}
