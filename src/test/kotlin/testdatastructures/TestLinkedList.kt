package testdatastructures

import datastructures.LinkedList
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class TestLinkedList {
    private lateinit var linkedList: LinkedList<Int>

    @BeforeEach
    fun setup() {
        linkedList = LinkedList()
    }


    @Test
    fun testEmptyLinkedListReturnsTrue() {
        assertTrue(linkedList.isEmpty)
    }

    @Test
    fun testNonEmptyLinkedListReturnsFalse() {
        linkedList.addToTail(1)
        linkedList.addToTail(2)

        assertFalse(linkedList.isEmpty)
    }

    @Test
    fun testListSizeUpdatesCorrectlyAfterAddingToHead() {
        linkedList.addToHead(1)
        linkedList.addToHead(2)

        assertTrue(linkedList.size == 2)
    }

    @Test
    fun testLinkedListSizeUpdatesCorrectlyAfterAddingToTail() {
        linkedList.addToTail(1)
        linkedList.addToTail(2)
        linkedList.addToTail(3)

        assertTrue(linkedList.size == 3)
    }

    @Test
    fun testLinkedListSizeUpdatesCorrectlyAfterAdding() {
        linkedList.addToHead(1)
        linkedList.addToTail(2)
        linkedList.addToTail(3)
        linkedList.addToHead(0)

        assertTrue(linkedList.size == 4)
    }

    @Test
    fun testLinkedListHeadIsCorrect() {
        linkedList.addToTail(2)
        linkedList.addToTail(3)
        linkedList.addToHead(1)

        assertTrue(linkedList.headNode?.item == 1)
    }

    @Test
    fun testLinkedListTailIsCorrect() {
        linkedList.addToHead(2)
        linkedList.addToHead(1)
        linkedList.addToTail(3)

        assertTrue(linkedList.tailNode?.item == 3)
    }

    @Test
    fun testLinkedListPointsToCorrectNode() {
        linkedList.addToTail(1)
        linkedList.addToTail(2)
        linkedList.addToTail(3)
        linkedList.addToTail(4)

        assertTrue(linkedList.headNode?.item == 1)
        assertTrue(linkedList.headNode?.next?.item == 2)
        assertTrue(linkedList.headNode?.next?.next?.item == 3)
        assertTrue(linkedList.headNode?.next?.next?.next?.item == 4)
        assertTrue(linkedList.headNode?.next?.next?.next?.next == null)
        assertTrue(linkedList.tailNode?.item == 4)
        assertTrue(linkedList.tailNode?.next == null)
    }

    @Test
    fun testLinkedListSizeUpdatesCorrectlyAfterRemoving() {
        linkedList.addToTail(1)
        linkedList.addToTail(2)

        linkedList.removeItem(2)
        assertTrue(linkedList.size == 1)

        linkedList.removeItem(1)
        assertTrue(linkedList.size == 0)

        linkedList.addToTail(1)
        assertTrue(linkedList.size == 1)
    }
}
