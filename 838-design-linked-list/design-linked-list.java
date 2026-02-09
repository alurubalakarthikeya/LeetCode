class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    Node head;
    int size;
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    public int get(int index) {
        int counter = 0;
        Node ptr = head;
        int value = -1;
        if(index<0||index>size){
            return -1;
        }
        while(ptr!=null){
            if(counter==index){
                return ptr.val;
            }
            ptr = ptr.next;
            counter += 1;
        }
        return -1;
    }
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size += 1;
    }
    public void addAtTail(int val) {
        if(head == null){
           addAtHead(val);
           return;
        }
        Node ptr = head;
        while(ptr.next!=null){
            ptr = ptr.next;
        }
        Node newNode = new Node(val);
        ptr.next = newNode;
        size += 1;
    }
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;
        if (index == 0) {
           addAtHead(val);
           return;
        }
        if (index == size) {
           addAtTail(val);
           return;
        }
        int counter = 0;
        Node ptr = head;
        if(index<0 || index > size) return;
        while(ptr!=null){
            if(counter == index-1){
                Node newNode = new Node(val);
                newNode.next = ptr.next;
                ptr.next = newNode;
                size += 1;
                return;
            }
            ptr = ptr.next;
            counter += 1;
        }
    }
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) {
            head = head.next;
            size -= 1;
            return;
        }
        int counter = 0;
        Node ptr = head;
        while(ptr!=null){
            if(counter == index-1 && ptr.next != null){
                ptr.next = ptr.next.next;
                size -= 1;
                return;
            }
            ptr = ptr.next;
            counter += 1;
        }
    }
}
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */