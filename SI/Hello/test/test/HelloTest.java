/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import hello.Hello;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTest {
    
    public HelloTest() {
        
    }
    
    @Test
    public void fib(){       
        assertEquals("values must be same", Hello.fib(1), 1);
        assertEquals("values must be same", Hello.fib(2), 1);
        assertEquals("values must be same", Hello.fib(3), 2);
        assertEquals("values must be same", Hello.fib(4), 3);
        assertEquals("values must be same", Hello.fib(5), 5);
        assertEquals("values must be same", Hello.fib(6), 8);
        assertEquals("values must be same", Hello.fib(7), 13);
        assertEquals("values must be same", Hello.fib(8), 21);
        assertEquals("values must be same", Hello.fib(9), 34);
        assertEquals("values must be same", Hello.fib(10), 55);
        assertEquals("values must be same", Hello.fib(11), 89);
        assertEquals("values must be same", Hello.fib(12), 144);
    }
    
    @Test
    public void fibSum(){
        int n=10;
        long sum = Hello.fibSum(n);
        long sumCheck = Hello.fib(n+2) - 1;
        
        assertEquals("values must be same", sum, sumCheck);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
}
