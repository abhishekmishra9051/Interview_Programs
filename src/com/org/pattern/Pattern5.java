package com.org.pattern;

public class Pattern5 {
    public static void main(String args[]){
        int i,j,n=5;
        for(i =0 ; i<=n; i++){
            for(j=0; j<i;j++){
                System.out.print(j+1);
            }
            System.out.println(" ");
        }
    }
}
