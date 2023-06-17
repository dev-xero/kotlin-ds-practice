package testdatastructures

import datastructures.LinkedList
import org.testng.Assert.assertTrue
import org.testng.annotations.Test

class TestLinkedList {
    private val list = LinkedList<Int>()

    @Test
    fun testLinkedListAppend() {
        list.append(1)
        list.append(2)

        assertTrue(list.getSize() == 2)
    }

    @Test
    fun testIterateList() {
        list.iterate()
    }

    @Test
    fun testRemoveListNode() {
        val size = list.getSize()
        list.removeNode()

        assertTrue(list.getSize() < size)
    }

    @Test
    fun testLinkedListPrepend() {
        list.prepend(0)
        assertTrue(list.getHead()?.item == 0)

        list.prepend(-1)
        assertTrue(list.getHead()?.item == -1)
    }

    @Test
    fun testLinkedListGetTail() {
        println(list.getTail()?.item)
        assertTrue(list.getTail()?.item == 2)
    }

    @Test
    fun main() {
        val testHead = LinkedList<Int>()
        testHead.prepend(3)
        testHead.prepend(2)
        testHead.prepend(1)

        testHead.removeNode()

        testHead.iterate()
    }

}