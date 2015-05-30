package test.by.slesh.bsparser.model;


import static org.junit.Assert.*;

import org.junit.Test;

import by.slesh.bsparser.model.Complex;


/**
 * @author Eugene Putsykovich(slesh) May 30, 2015
 * 
 *         test for complex
 */
public class ComplexTests {

        @Test
        public void multiply() {
                final Complex expected = new Complex(-1, 47);

                Complex c1 = new Complex(5, 3);
                Complex c2 = new Complex(4, 7);

                Complex actual = c1.multiply(c2);
                
                assertTrue(expected.getRe() == actual.getRe());
                assertTrue(expected.getIm() == actual.getIm());
        }
        
        @Test
        public void divided(){
                final Complex expected = new Complex(1, -2);

                Complex c1 = new Complex(7, -4);
                Complex c2 = new Complex(3, 2);

                Complex actual = c1.divided(c2);
                
                assertTrue(expected.getRe() == actual.getRe());
                assertTrue(expected.getIm() == actual.getIm());
        }
        
        @Test
        public void add(){
                final Complex expected = new Complex(3, 4);

                Complex c1 = new Complex(2, 3);
                Complex c2 = new Complex(1, 1);

                Complex actual = c1.add(c2);
                
                assertTrue(expected.getRe() == actual.getRe());
                assertTrue(expected.getIm() == actual.getIm());
        }
        
        @Test
        public void subtract(){
                final Complex expected = new Complex(1, 2);

                Complex c1 = new Complex(2, 3);
                Complex c2 = new Complex(1, 1);

                Complex actual = c1.subtract(c2);
                
                assertTrue(expected.getRe() == actual.getRe());
                assertTrue(expected.getIm() == actual.getIm());
        }
}
