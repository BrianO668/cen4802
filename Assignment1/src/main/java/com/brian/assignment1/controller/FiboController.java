package com.brian.assignment1.controller;

import com.brian.assignment1.FiboFinder;
import com.brian.assignment1.PrimeFinder;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("fibo")
public class FiboController {
    private final FiboFinder fibo = new FiboFinder();
    private final PrimeFinder primo = new PrimeFinder();
    private static final Logger loggy = Logger.getLogger(FiboFinder.class.getName());

    @GetMapping("/{n}")
    public FiboResponse getFibo(@PathVariable int n) {
        loggy.info("Received variable " + n);
        int result = fibo.FindTerm(n);
        loggy.info("Result is " + result);
        boolean isPrime = primo.IsPrime(result);
        loggy.info("T/F Result is prime " + isPrime);

        loggy.info("Attempting to acquire response");
        return new FiboResponse(n, result, isPrime);
    }
}
