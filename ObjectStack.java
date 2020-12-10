public class ObjectStack<T> implements Stack<T> {
    private Node<T> top;

    // casinha
    private class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            next = null;
        }
        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    public ObjectStack() {
        top = null;
    }


    public void push(T data) {
        // criar a casinha
        Node<T> aux = new Node<>(data);

        // se a pilha estiver vazia
        if (isEmpty()) {
            top = aux;
        } else {
            aux.next = top;
            top = aux;
        }
    }

    public T pop() {
        Node<T> aux;
        T data;


        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Pilha esta vazia!");
        }

        aux = top;
        top = top.next;
        aux.next = null;
        data = aux.data;

        return data;
    }

    public boolean isEmpty() {
        return (top == null);
    }
}