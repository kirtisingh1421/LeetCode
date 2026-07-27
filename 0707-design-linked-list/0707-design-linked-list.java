class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class MyLinkedList {
    Node head;
    Node tail;
    int size;
    public MyLinkedList() {
    }
    
    public int get(int index) {
        if(index < 0 || index >= size) return -1;
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head= temp;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        if(tail == null){
            addAtHead(val);
            return;
        }
        Node temp = new Node(val);
        tail.next = temp;
        tail = temp;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) return;
        else if(index == 0){
            addAtHead(val);
            return;
        }
        else if(index == size){
            addAtTail(val);
            return;
        }
        else{
            Node t = new Node(val);
            Node temp = head;
            for(int i=0;i<index-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;
        if(index == 0){     //delete first node
            head = head.next;
            if(head == null){   ////list become empty
                tail = null;  
            }
            size--;
            return;
        }
        Node temp = head;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        if(temp.next == tail){      //deleting last node.
            tail = temp;
        }
        temp.next = temp.next.next;
        size--;
    }
}

