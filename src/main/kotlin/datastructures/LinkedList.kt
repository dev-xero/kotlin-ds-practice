package datastructures

class Node<T>(val item: T) {
    var next: Node<T>? = null
}

class LinkedList<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    fun getHead(): Node<T>? {
        return head
    }

    fun getTail(): Node<T>? {
        return tail
    }

    fun append(item: T) {
        val newNode = Node(item)

        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            tail?.next = newNode
            tail = newNode
        }

        size += 1
    }

    fun prepend(item: T) {
        val newNode = Node(item)

        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            val oldHead = head

            newNode.next = oldHead
            head = newNode
        }

        size += 1
    }

    fun removeNode(): T? {
        if (tail != null) {
            val removedNodeItem = tail?.item

            if (head == tail) {
                head = null
                tail = null
                size = 0
            } else {
                var curr = head

                while (curr?.next != tail) {
                    curr = curr?.next
                }

                tail = curr
                tail?.next = null
                size -= 1
            }

            return removedNodeItem
        }

        return null
    }

    fun getSize(): Int {
        return size
    }

    fun iterate(): Boolean {
        var curr = head

        while (curr != null) {
            println(curr.item)
            curr = curr.next
        }

        return true
    }
}