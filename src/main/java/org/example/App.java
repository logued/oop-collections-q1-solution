package org.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Collections Exercise SOLUTIONS   Feb 2023
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Collection Exercises!" );
        App app = new App();
        app.start();
    }

    public void start() {
        // Instantiate and populate the list
        LinkedList<Integer> list = new LinkedList<Integer>((Arrays.asList(1,2,3,4,5,6,7,8,9,10)));

        LinkedList<Integer> reducedList = new LinkedList<Integer>();

        // Use iterator
        ListIterator<Integer> iterator = list.listIterator();
        while( iterator.hasNext() ) {
            int value = iterator.next();
            reducedList.add( value);
            if( iterator.hasNext()) {
                iterator.next();  // skip one
            }
        }

        System.out.println( reducedList );
    }
}
