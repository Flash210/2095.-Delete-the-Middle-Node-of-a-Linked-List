class Node(var data: Int) {
    var next: Node? = null
}

class LinkedList {
    var head: Node? = null

    fun append(data: Int) {
        val newNode = Node(data)
        if (head == null) {
            head = newNode
            return
        }
        var current = head
        while (current?.next != null) {
            current = current.next
        }
        current?.next = newNode
    }





    fun DisplayLinkedListData() {


        var curent = head

        while (curent != null) {
            print("${curent.data} ->")
            curent = curent.next
        }

        println("null")
    }

    fun  DeleteTheMiddleNode():Node?{

        if ( head == null || head?.next == null) return null


        var fast = head?.next?.next
        var slow=head

        while( fast!=null && fast.next!=null){
            slow=slow?.next
            fast=fast?.next?.next

        }
        slow?.next=slow?.next?.next




        return head

    }
}
    fun main(args: Array<String>) {

var list=LinkedList()
        list.append(1)
        list.append(2)
        list.append(3)
        list.append(4)

        list.DisplayLinkedListData()
        list.DeleteTheMiddleNode()
list.DisplayLinkedListData()
    }

