package com.org.pattern;

public class Pattern4 {
    public  static void main (String args[]){
        int i,j,k,size=5;
        for(i=0; i<size+1; i++){
            for(j=size; j>i; j--){
                System.out.print(" ");
            }
        for(k=0; k <(2*i-1); k++){
            System.out.print("*");
        }
        System.out.println(" ");
        }
    }
}
