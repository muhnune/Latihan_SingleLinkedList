public class singlylinkedlist {
    Node head;
    int size = 0;

    class Node {
        String nama;

        Node next;
        Node prev;

        Node(String data) {
            nama = data;
        }
    }

    public void addFirst(String new_data) {
        Node anakKos = new Node(new_data);
        anakKos.next = head;
        head = anakKos;
        size++;
    }

    public static void main(String[] args) {
        singlylinkedlist dataanakkos = new singlylinkedlist();

        dataanakkos.addFirst("ciko");

        System.out.println();
    }
}
