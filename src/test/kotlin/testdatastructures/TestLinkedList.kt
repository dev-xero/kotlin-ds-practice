package testdatastructures

import datastructures.LinkedList
import org.testng.Assert.assertTrue
import org.testng.annotations.Test

class TestLinkedList {
    private val list = LinkedList<Int>()

    @Test
    fun testLinkedListAdd() {
        list.append(1)
        list.append(2)

        assertTrue(list.getSize() == 2)
    }

    @Test
    fun testIterateList() {
        list.iterateList()
    }

    @Test
    fun testRemoveListNode() {
        list.removeNode()

        assertTrue(list.getSize() == 1)
    }

}