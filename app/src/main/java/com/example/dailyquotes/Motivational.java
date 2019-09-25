package com.example.dailyquotes;

import java.util.Random;

public class Motivational {

    private Quote[] Quotes;

    public Motivational(){
        Quotes = new Quote[8];

        Quotes[0] = new Quote("I learned very early the difference between knowing the name of something and knowing something", "―  Richard P. Feynman");
        Quotes[1] = new Quote("Society grows great when old men plant trees whose shade they know they shall never sit in.","―  Anonymous Greek Proverb");
        Quotes[2] = new Quote("Be yourself; everyone else is already taken.","― Oscar Wilde");
        Quotes[3] = new Quote("Be who you are and say what you feel","― Bernard M. Baruch");
        Quotes[4] = new Quote("Be the change that you wish to see in the world.","― Mahatma Gandhi");
        Quotes[5] = new Quote("You know you're in love when you can't fall asleep because reality is finally better than your dreams.","Dr. Seuss");
        Quotes[6] = new Quote("In three words I can sum up everything I've learned about life: it goes on.","― Robert Frost");
        Quotes[7] = new Quote("No one can make you feel inferior without your consent.","― Eleanor Roosevelt");

    }

    public Quote getARandomQuote(){
        Random randomGen = new Random();
        int randomNo = randomGen.nextInt(Quotes.length);

        return Quotes[randomNo];
    }
}
