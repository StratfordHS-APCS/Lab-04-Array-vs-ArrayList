import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * The test class UseArraysTest.
 *
 * @author  Dave Avis
 * @version 9.6.2018
 */
public class UseArraysTest
{
    /**
     * Default constructor for test class UseArraysTest.
     */
    public UseArraysTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    /**
     * Tests allPrimesUpTo()
     */
    @Test
    public void allPrimesUpToTest()
    {
        int[] result = UseArrays.allPrimesUpTo( 10 );
        int[] expected = { 2, 3, 5, 7 };
        assertArrayEquals( "Testing allPrimesUpTo( 10 ), ", expected, result );
        
        int[] result2 = UseArrays.allPrimesUpTo( 15 );
        int[] expected2 = { 2, 3, 5, 7, 11, 13 };
        assertArrayEquals( "Testing allPrimesUpTo( 15 ), ", expected2, result2 );
        
        int[] result3 = UseArrays.allPrimesUpTo( 20 );
        int[] expected3 = { 2, 3, 5, 7, 11, 13, 17, 19 };
        assertArrayEquals( "Testing allPrimesUpTo( 20 ), ", expected3, result3 );
        
        int[] result4 = UseArrays.allPrimesUpTo( 25 );
        int[] expected4 = { 2, 3, 5, 7, 11, 13, 17, 19, 23 };
        assertArrayEquals( "Testing allPrimesUpTo( 20 ), ", expected4, result4 );
        
        int[] result5 = UseArrays.allPrimesUpTo( 30 );
        int[] expected5 = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
        assertArrayEquals( "Testing allPrimesUpTo( 20 ), ", expected5, result5 );
    }
    
    /**
     * Tests squareEachElement()
     */
    @Test
    public void squareEachElementTest()
    {
        int[] input = { 1, 2, 3, 4, 5 };
        int[] result = UseArrays.squareEachElement( input.clone() );
        int[] expected = { 1, 4, 9, 16, 25 };
        assertArrayEquals( "Testing squareEachElement(), ", expected, result );
    }
    
    /**
     * Tests removeElement()
     */
    @Test
    public void removeElementTest()
    {
        int[] input = { 1, 2, 3, 4, 5 };
        int[] result = UseArrays.removeElement( input.clone(), 3 );
        int[] expected = { 1, 2, 3, 5 };
        assertArrayEquals( "Testing removeElement(), ", expected, result );
    }
}
