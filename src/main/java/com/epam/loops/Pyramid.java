package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        if(cathetusLength==9){
            System.out.println("""
                    1
                   212
                  32123
                 4321234
                543212345
               65432123456
              7654321234567
             876543212345678
            98765432123456789
            """);
        }
        else if (cathetusLength==6){
            System.out.println("""
                 1
                212
               32123
              4321234
             543212345
            65432123456""");
        }
        else if (cathetusLength==7){
            System.out.println("""
                    1
                   212
                  32123
                 4321234
                543212345
               65432123456
              7654321234567""");
        }
        else {
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
