import java.util.ArrayList;

/**
 * Write a description of class UseArrayLists here.
 *
 * @author (name)
 * @version (date)
 */
public class UseArrayLists
{
    public static ArrayList<Integer> allPrimesUpTo( int max )
    {
        // using a loop, make an arrayList of all of the primes from 2 through max.
        // Return the List of primes.
    }
    
    public static ArrayList<Integer> squareEachElement( ArrayList<Integer> list )
    {
        // square each element in list.
        // remember to operate on a new copy of list so you don't modify (destroy) the
        // original list.
        // return the List of squared values.
    }
    
    public static ArrayList<Integer> removeElement( ArrayList<Integer> list, int element )
    {
        // remove element number "element" from the list.
        // remember to operate on a new copy of list so you don't modify (destroy) the
        // original list.
        // reutrn the new List.
    }
    
    public static void printList( ArrayList<Integer> list )
    {
        // using an enhanced for loop to nicely print the array
    }
    
    public static void main( String[] args )
    {
        
        // you may modify anything in this method without failing the tests.
        System.out.println( "Getting all prime numbers through 100..." );
        // call allPrimesUpTo() and store the result as a variable
        // print the result using printList()
        System.out.println( "Squaring all of the primes..." );
        // call squareEachElement()
        // print the list of squared elements using printList()
        System.out.println( "Removing the 4th prime number..." );
        // call removeElement() to remove an element from an array.
        // print the result using printList()
    }
}
