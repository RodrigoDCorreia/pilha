import java.util.EmptyStackException;

public class ArrayStack<T> implements Stack<T> {
    private int tam = 20;
    private int topo;
    private int fim;
    private T[] pilha;
    private int capacidade;

    public ArrayStack(int tam) {
        topo = -1;
        pilha = (T[]) new Object[tam];
        capacidade = tam;
        this.tam = 0;
    }

    public ArrayStack() {
        this.tam = tam;

    }

    public boolean isFull() {
        return topo == capacidade - 1;
    }

    @Override
    public void push(Object data) {
        if (isFull())
            throw new StackOverflowError("Pilha cheia!");

        pilha[++topo] = (T) data;
        tam++;
    }

    @Override
    public T pop() {
        T data;

        if (isEmpty())
            throw new EmptyStackException();

        data = pilha[topo--];
        tam--;

        return data;
    }

    @Override
    public boolean isEmpty() {
        return topo == -1;
    }

    @Override
    public int getTam() {
        return tam;
    }
}