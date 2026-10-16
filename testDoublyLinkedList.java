/**
 * testSinglyLinkedList
 */
public class testDoublyLinkedList {

    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addLast(6);
        System.out.println(linkedList.get(2)); // Menghasilkan nilai 3
        System.out.println(linkedList.indexOf(6)); // Menghasilkan 5
        System.out.println(linkedList.indexOf(10)); // Menghasilkan -1
        linkedList.printReverse(); // Menghasilkan 6,5,4,3,2,1
        System.out.println(linkedList.remove(3)); // Menghasilkan true
        System.out.println(linkedList.remove(8)); // Menghasilkan false
        System.out.println(java.util.Arrays.toString(linkedList.toArray()).replace(" ", "")); // Menghasilkan [1,2,4,5,6]
        System.out.println(linkedList.get(12)); // Terjadi exception error
    }
}