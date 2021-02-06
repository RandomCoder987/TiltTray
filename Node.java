public class Node {
        Node next = null;
        Slot data = null;
        int id;

        Node(){
            data = new Slot();
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Slot getData() {
            return data;
        }

        public void setData(Slot data) {
            this.data = data;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
}
