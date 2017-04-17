package org.github.martindevelopment;


public class Collatz {
    
    public static int Start(long x){
        int steps = 0;
        while(true){
            if(x == 1){
                return steps;}
            else if(x % 2 == 0){
                x = x/2; steps += 1;}
            else{
                x = x*3+1; steps += 1;
    }   }   }   
}   
