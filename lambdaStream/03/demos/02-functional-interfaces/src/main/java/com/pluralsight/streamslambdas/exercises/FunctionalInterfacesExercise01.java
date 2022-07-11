/*
 * This code is part of the course "Working with Streams and Lambda Expressions in Java (Java SE 11 Developer Certification 1Z0-819)" for Pluralsight.
 *
 * Copyright (C) 2021 by Jesper de Jong (jesper@jdj-it.com).
 */
package com.pluralsight.streamslambdas.exercises;

import com.pluralsight.streamslambdas.Product;

import java.util.ArrayList;
import java.util.List;

public class FunctionalInterfacesExercise01 {

    /**
     * Exercise 1: Filter a list of products.
     * <p>
     * Choose a standard functional interface for the parameter 'f'.
     * Which functional interface is appropriate here? (Function, Consumer, Supplier, Predicate, ...)
     * <p>
     * Implement the method.
     *
     * @param products List of products to filter. (Note: The method should not modify this list).
     * @param f        Determines which products should be in the result.
     * @return A filtered list of products.
     */
    public List<Product> filterProducts(List<Product> products, /* TODO: Replace 'Object' with a functional interface */ Object f) {
        List<Product> result = new ArrayList<>();

        // TODO: Implement this method. Loop through the list of products, call 'f' to determine if a product should be
        // in the result list, and put it in the result list if appropriate.

        return result;
    }
}
