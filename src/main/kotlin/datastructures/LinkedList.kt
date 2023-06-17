package datastructures

private class Node<T>(val item: T) {
    var next: Node<T>? = null
}

class LinkedList<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    fun addNode(item: T) {
        val newNode = Node(item)

        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            tail?.next = newNode
            tail = newNode
        }
    }

    fun iterateList() {
        var curr = head

        while (curr != null) {
            println(curr.item)
            curr = curr.next
        }
    }
}