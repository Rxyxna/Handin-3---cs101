import Article.Article;
import RedditFrontPage.RedditFrontPage;
import RedditPost.RedditPost;
import Square.Square;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;



public class Main {
    public static void main(String[] args) {

        // A) - Call the method 10 times by using a loop
        for (int i = 0; i < 10; i++) {
            int randomNumber = GetRandomNumber();
            System.out.println(randomNumber);

        }
        // B) Write a method that returns if a user has input a valid CPR number.
        Scanner scanCpr = new Scanner(System.in);
        System.out.print("Enter your CPR number: ");
        String cprNumber = scanCpr.nextLine();

        boolean isValidCPR = ValidCprNumber(cprNumber);
        if (isValidCPR) {
            System.out.println("The CPR number is valid.");
        } else {
            System.out.println("The CPR number is not valid.");
        }

        // C) Create 5 articles, add them into an ArrayList and print them by overriding the .toString() method
        ArrayList<Article> articles = new ArrayList<>();

        articles.add(new Article("Rajana Bagaeva", "Life as a KEA student"));
        articles.add(new Article("Vespasian Kaleva", "The Sunken Veil"));
        articles.add(new Article("Dronning Magrethe", "Harry Potter"));
        articles.add(new Article("Lille Peter Edderkop", "The Office"));
        articles.add(new Article("Albert Jensen", "Titanic"));

        System.out.println(articles);

        // D) Sort a list of squares using collections.sort();

        Square squareOne = new Square(2.5, 4.5);
        Square squareTwo = new Square(5.2, 10);
        Square squareThree = new Square(7.1, 9);

        ArrayList<Square> newSquares = new ArrayList<>();
        newSquares.add(squareOne);
        newSquares.add(squareTwo);
        newSquares.add(squareThree);

        Collections.sort(newSquares);

        for (Square square : newSquares) {
            System.out.println("Perimeter:" + square.getPerimeter());
        }

        // E) New redditpost is initiated
        RedditPost post = new RedditPost("Rajana Bagaeva", "KEA");
        post.getDate();
        post.getDownvotes();
        post.getUpvotes();
        System.out.println(post);

    }

        // A) - Write a method that returns a random number between 1-10.
    public static int GetRandomNumber() {
        Random random = new Random();
        int x = random.nextInt(10) + 1;
        return x;
    }

    // B) Write a method that returns if a user has input a valid CPR number.
    public static boolean ValidCprNumber(String cpr) {
        if (cpr.length() == 10) {    // 10 Digits.
            return false;
        }

        int day = Integer.parseInt(cpr.substring(0, 2));
        int month = Integer.parseInt(cpr.substring(2, 4));

        if (day <= 31) {
            return true;    // The first 2 digits are not above 31.
        }

        if (month <= 12) {
            return true;   // The middle 2 digits are not above 12.

        } else {
            return false;
        }




    }
}


