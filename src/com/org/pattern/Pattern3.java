package com.org.pattern;

public class Pattern3 {
    public static  void main (String args[]){
        int i ,j ,Lines = 8;
        for(i=1; i<Lines; i++){
            for(j=1; j<=Lines/2; j++){
                if(i==j)
                    System.out.print(j);
                else if (i>4 && j == Lines- i)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            j=j-2;
            while(j>0){
                if(i==j)
                    System.out.print(j);
                else if(i>4 && j==Lines-i)
                    System.out.print(j);
                else
                    System.out.print(" ");
                j--;
            }
            System.out.println("");
        }
    }
}
