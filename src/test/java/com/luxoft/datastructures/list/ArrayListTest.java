package com.luxoft.datastructures.list;

import com.luxoft.datastructures.stack.ArrayStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
    @Test
    public void testAddToList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        assertEquals(1, arrayList.get(0));
        assertEquals(2, arrayList.get(1));
        assertEquals(3, arrayList.get(2));

    }

    @Test
    public void testAddByIndexToList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(3 );
        arrayList.add(1 );
        arrayList.add(2, 1);

        assertEquals(2, arrayList.get(1));
        assertEquals(1, arrayList.get(2));
    }

    @Test
    public void testRemoveByIndex() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.remove(1);

        assertEquals(1, arrayList.get(0));
        assertEquals(3, arrayList.get(1));
    }

    @Test
    public void testSetToList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        assertEquals(1, arrayList.get(0));
        assertEquals(2, arrayList.get(1));
        assertEquals(3, arrayList.get(2));

        arrayList.set(1, 2);
        arrayList.set(2, 0);
        arrayList.set(3, 1);

        assertEquals(1, arrayList.get(2));
        assertEquals(2, arrayList.get(0));
        assertEquals(3, arrayList.get(1));
    }

    @Test
    public void testClear() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        assertEquals(4, arrayList.size());
        assertNotNull(arrayList.get(0));
        assertNotNull(arrayList.get(1));
        assertNotNull(arrayList.get(2));
        assertNotNull(arrayList.get(3));

        arrayList.clear();

        assertEquals(0, arrayList.size());
    }

    @Test
    public void testIsEmpty() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        assertFalse(arrayList.isEmpty());

        arrayList.clear();

        assertTrue(arrayList.isEmpty());
    }

    @Test
    public void testIndexOf() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        assertEquals(0, arrayList.indexOf(1));
        assertEquals(1, arrayList.indexOf(2));
        assertEquals(2, arrayList.indexOf(3));
    }

    @Test
    public void testLastIndexOf() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        assertEquals(4, arrayList.lastIndexOf(4));
    }
}
