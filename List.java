package list;

// Verification that KWLinkedList and KWArrayList implement the
// Collection interface. This assumes that all other exercises have been 
// implemented

import java.util.Collection;

public class List 
{
    public static void main(String[] args)
    {
        Collection<String> textCollection1 = new KWArrayList<String>();
        Collection<String> testCollection2 = new KWLinkedList<String>();
    }
}