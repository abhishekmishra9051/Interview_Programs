package com.org.pattern;

public class Pattern1 {
    public static void main(String[] args) {
        int i ,j, Lines=5;
        for(i=1; i<=Lines; i++){
            for(j=Lines;j>=1; j--){
                if (j!=i)
                    System.out.print(j);
                else
                    System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
