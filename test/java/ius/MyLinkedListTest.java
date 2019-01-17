package ius;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 *  Test class for MyLinkedList
 */
public class MyLinkedListTest {


    /**
     * Test of next.
     */
    @Test
    public void Next() {
        MyLinkedList test = new MyLinkedList(2);
        test.next();
        assertEquals(2, test.get());
    }


    /**
     * Test of last.
     */
    @Test
    public void Last() {
        MyLinkedList test = new MyLinkedList(4);
        test.last();
        assertEquals(4, test.get());

    }

    /**
     * Test of after.
     */
    @Test
    public void After() {
        MyLinkedList test = new MyLinkedList(5);
        test.after(6);
        assertEquals(5, test.get());
    }

    /**
     * Test of detach.
     */
    @Test
    public void Detach() {
        MyLinkedList test = new MyLinkedList(7);
        test.detach();
        assertEquals(7, test.get());
    }

    /**
     * Test of get.
     */
    @Test
    public void Get() {
        MyLinkedList test = new MyLinkedList(3);
        assertEquals(3, test.get());
    }

    /**
     * Test of set
     */
    @Test
    public void Set() {
        MyLinkedList test = new MyLinkedList();
        test.set(11);
        assertEquals(11, test.get());
    }

    /**
     * Test of setNext.
     */
    @Test
    public void SetNextILinkedList() {
        MyLinkedList test = new MyLinkedList();

    }

    /**
     * Test of setNext
     */
    @Test
    public void SetNext() {
        MyLinkedList test = new MyLinkedList(1);
        test.setNext(test);
        assertEquals(1, test.get());
    }


    /**
     * Test of append.
     */
    @Test
    public void Append() {
        MyLinkedList test = new MyLinkedList(8);
        test.append(test);
        assertEquals(8, test.get());
    }

    /**
     * Test of insert
     */
    @Test
    public void Insert() {
        MyLinkedList test = new MyLinkedList(9);
        test.insert(test);
        assertEquals(9, test.get());
    }


}

