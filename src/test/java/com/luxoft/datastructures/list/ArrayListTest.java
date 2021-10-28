package com.luxoft.datastructures.list;

import com.luxoft.datastructures.stack.ArrayStack;
import org.junit.jupiter.api.Assertions;
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

    @Test
    public void testThrowIndexBoundsOfOutExceptionWithLargerIndex() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            arrayList.add(2, 2);
        });
    }

    @Test
    public void testThrowIndexBoundsOfOutExceptionWithLargerIndexOnRemove() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            arrayList.remove(1);
        });
    }

    @Test
    public void testThrowIndexBoundsOfOutExceptionWithLargerGetIndex() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            arrayList.get(1);
        });
    }

    @Test
    public void testVerifyArrayResizedWhenMeetLimitation() {
        ArrayList arrayList = new ArrayList();

        // by default array list has size 10
        // Let fill current instance with 10 new objects
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        assertEquals(10, arrayList.size());

        // add an extra value to the list so it will increase own size
        arrayList.add(11);

        assertEquals(11, arrayList.size());
    }

    @Test
    public void testVerifySizeIsChangesWhenAddAndRemoveValues() {
        ArrayList arrayList = new ArrayList();
        assertEquals(0, arrayList.size());
        arrayList.add(1);
        assertEquals(1, arrayList.size());
        arrayList.remove(arrayList.size() - 1);
        assertEquals(0, arrayList.size());
    }

    @Test
    public void testArrayListIsEmpptyAfterClearMethod() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        assertFalse(arrayList.isEmpty());
        arrayList.clear();
        assertTrue(arrayList.isEmpty());
    }
}
