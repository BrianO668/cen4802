package com.brian.assignment1; /**
 * The com.brian.assignment1.Main method that is used to find the Fibonacci Sequence term.
 * This method instantiates a com.brian.assignment1.FiboFinder class, hard assigns an int to n,
 * and then runs the com.brian.assignment1.FiboFinder's FindTerm method to returns the integer that corresponds
 * with the nth term of the Fibonacci Sequence.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

@SpringBootApplication
public class Main {
    private static final Logger loggy = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Logger rootLog = Logger.getLogger("");
        try {
            FileHandler fh = new FileHandler("logs.log", false);
            loggy.info("Log file created/accessed");
            fh.setFormatter(new SimpleFormatter());
            loggy.info("Log format set");

            rootLog.addHandler(fh);
            rootLog.setLevel(Level.ALL);
            loggy.info("Log level set to " + rootLog.getLevel());
        }
        catch (Exception e) {
            loggy.log(Level.SEVERE, "Cannot open log file!", e);
        }
        loggy.info("Application starting...");

        SpringApplication.run(Main.class, args);
        /*
        loggy.info("Creating root log...");
        Logger rootLog = Logger.getLogger("");
        loggy.info("Root logger created");
        Scanner scanny = new Scanner(System.in);

        loggy.info("Attempting to access log file");
        try {
            FileHandler fh = new FileHandler("logs.log", false);
            loggy.info("Log file created/accessed");
            fh.setFormatter(new SimpleFormatter());
            loggy.info("Log format set");

            rootLog.addHandler(fh);
            rootLog.setLevel(Level.ALL);
            loggy.info("Log level set to " + rootLog.getLevel());
        }
        catch (Exception e) {
            loggy.log(Level.SEVERE, "Cannot open log file!", e);
        }

        loggy.info("Application starting...");

        loggy.info("com.brian.assignment1.FiboFinder instantiating...");
        FiboFinder fibo = new FiboFinder();
        loggy.info("com.brian.assignment1.PrimeFinder instantiating...");
        PrimeFinder pf = new PrimeFinder();

        while (true) {
            try {
                loggy.info("Please enter an integer: ");
                int n = Integer.parseInt(scanny.nextLine());
                loggy.info("Assigning value to int n...");
                loggy.info("int value assigned as " + n);

                loggy.info("Printing results to console...");
                System.out.println("THIS PROGRAM HAS, ONCE AGAIN, BEEN MODIFIED SLIGHTLY\n" + "The " + n + "th term of the Fibonacci sequence is: " +
                        fibo.FindTerm(n) + ".\nIs this number a prime number?: " + pf.IsPrime(fibo.FindTerm(n)));
                break;
            }
            catch (Exception e) {
                loggy.log(Level.SEVERE, "Cannot parse integer given!", e);
                loggy.info("Please try again!");
            }
        }
         */
    }
}