
class Node:
    def __init__(self,value):
        self.value = value
        self.next = None

class LinkedList:
    def __init__(self,value):
        new_node = Node(value)
        self.head = new_node
        self.tail = new_node
        self.length = 1
#print
    def print_l(self):
        temp = self.head
        while temp is not None:
            print(temp.value)
            temp = temp.next


# append
    def append(self, value):
        new_node = Node(value)
        if self.head is None:
            self.head = new_node
            self.tail = new_node
        else:
            self.tail.next = new_node
            self.tail = new_node
        self.length += 1
my_linked_lt = LinkedList(1)
my_linked_lt.append(3)
my_linked_lt.print_l()