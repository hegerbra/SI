/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.HashMap;
import java.util.Map;

public class Hello {
    
    private static Map<Integer, Long> mapa = new HashMap<>();
    
    public static long fib(int n){
        if (mapa.containsKey(n))
            return mapa.get(n);
            
        if (n<=2) return 1;
        else {
            long ret = fib(n-1)+fib(n-2);
            mapa.put(n, ret);
            return ret;
        }
    }
    
    public static long fibSum(int n){
        if (n<=1) return fib(n);
        else return fib(n)+fibSum(n-1);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long sum = fibSum(10);
        System.out.println(sum);
    }
}
