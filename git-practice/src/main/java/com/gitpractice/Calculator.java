package com.gitpractice;

public class Calculator {
    public Calculator(){
    }
    public int add(int a, int b){
        return a + b;
    }
    public int subtract(int a, int b){
        return a - b;
    }
    public int multiply(int a, int b){
        return a * b;
    }
    public int divide(int a, int b){
        return a / b;
    }
    public int modulo(int a, int b){
        return a % b;
    }
    public static void main(String[] args){
        Calculator myCalculator = new Calculator();

        System.out.println(myCalculator.add(5, 7));

        System.out.println(myCalculator.subtract(45, 11));

        String name1 = "Deija";
        String adjective1 = "Crusty";
        String adjective2 = "Black";
        String noun1 = "Sandwhich";
        String noun2 = "Olives";
        String verb1 = "Swimming";
        String noun3 = "Hair";
        String adjective3 = "Smelly";
        String noun4 = "Negro";
        String place1 = "Sex Shop";
        String noun5 = "Dildo";
        String noun6 = "Penis";
        int number = 69;
        String name2 = "David";


        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+".\n 'It is going to be a "+adjective2+" day!'\n Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores.\n They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+".\n Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+"\n and dropped "+name1+" in a puddle of frozen "+noun5+".\n "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);

    }
}