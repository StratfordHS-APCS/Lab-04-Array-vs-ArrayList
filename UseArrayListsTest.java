import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The test class UseArrayListsTest.
 *
 * @author  Dave Avis
 * @version 9.6.2018
 */
public class UseArrayListsTest
{
    /**
     * Default constructor for test class UseArrayListsTest.
     */
    public UseArrayListsTest()
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
        ArrayList<Integer> result = UseArrayLists.allPrimesUpTo( 10 );
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList( 2, 3, 5, 7 ));
        assertTrue( "Testing allPrimesUpTo( 10 ) ", expected.equals( result ) );
        
        result = UseArrayLists.allPrimesUpTo( 15 );
        expected = new ArrayList<Integer>(Arrays.asList( 2, 3, 5, 7, 11, 13 ));
        assertTrue( "Testing allPrimesUpTo( 15 ) ", expected.equals( result ) );
        
        result = UseArrayLists.allPrimesUpTo( 20 );
        expected = new ArrayList<Integer>(Arrays.asList( 2, 3, 5, 7, 11, 13, 17, 19 ));
        assertTrue( "Testing allPrimesUpTo( 20 ) ", expected.equals( result ) );
        
        result = UseArrayLists.allPrimesUpTo( 25 );
        expected = new ArrayList<Integer>(Arrays.asList( 2, 3, 5, 7, 11, 13, 17, 19, 23 ));
        assertTrue( "Testing allPrimesUpTo( 25 ) ", expected.equals( result ) );
        
        result = UseArrayLists.allPrimesUpTo( 30 );
        expected = new ArrayList<Integer>(Arrays.asList( 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 ));
        assertTrue( "Testing allPrimesUpTo( 20 ) ", expected.equals( result ) );
    }
    
    /**
     * Tests squareEachElement()
     */
    @Test
    public void squareEachElementTest()
    {
        ArrayList<Integer> input = new ArrayList( Arrays.asList( 1, 2, 3, 4, 5 ));
        ArrayList<Integer> result = UseArrayLists.squareEachElement( input );
        ArrayList<Integer> expected = new ArrayList( Arrays.asList( 1, 4, 9, 16, 25 ));
        assertTrue( "Testing squareEachElement() ", expected.equals( result ) );
    }
    
    /**
     * Tests removeElement()
     */
    @Test
    public void removeElementTest()
    {
        ArrayList<Integer> input = new ArrayList( Arrays.asList( 1, 2, 3, 4, 5 ));
        ArrayList<Integer> result = UseArrayLists.removeElement( input, 3 );
        ArrayList<Integer> expected = new ArrayList( Arrays.asList( 1, 2, 3, 5 ) );
        assertTrue( "Testing removeElement() ", expected.equals( result ) );
    }
}
