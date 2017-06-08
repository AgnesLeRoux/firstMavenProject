package fr.ibformation;

import java.util.LinkedList;

import org.mockito.Mockito;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        LinkedList mockedList = Mockito.mock(LinkedList.class);
        
        Mockito.when(mockedList.get(0)).thenReturn("first");
        
        if(mockedList.get(0).equals("first"))
        	System.out.println("it works");
        else
        	System.out.println("it does not work");
        
    }
}
