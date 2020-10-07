package org.example;

//@Myannotation("tester")
public class Book {

//    @Myannotation
//    private String a = "A";
//
////    @Myannotation
//    Book() {
//
//    }

    public static String A = "A";
    private String B = "B";

    Book() {

    }

    public Book(String b) {
        B = b;
    }

    public void c() {
        System.out.println("C");

    }

    public int sum(int left, int right) {
        return left + right;
    }
};
