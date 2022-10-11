package com.org.pattern;

public class Pattern2 {
    public static void main(String[] args) {
        int i,j,Lines=5;
        for(i=1; i<=Lines;i++){
            for(j=1; j<=Lines;j++){
                if(i==j)
                    System.out.print("*");
                else
                    System.out.print("0");
            }
            j--;
            System.out.print("*");
            while (j>=1){
                if(i==j)
                    System.out.print("*");
                else
                    System.out.print("0");
                j--;
            }

            System.out.println("");

        }
    }
}
