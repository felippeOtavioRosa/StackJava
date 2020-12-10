public class StackObject<T> implements Stack<T> {

    private Node<T> topo; // referência do topo da pilha
    private  int tamanho;

    //casinha
    private class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public StackObject() {
        topo = null;
    }

    //empilhar
    public void push(T data) {
        // se a pilha estiver vazia
        if (isEmpty()){
            Node<T> aux = new Node<>(data);
            topo = aux;
        }
        else {
            Node<T> aux = new Node<>(data);
            aux.next = topo;
            topo = aux;
        }
        tamanho++;
    }

    // desempilhar
    public T pop() {

        T data ; // valor retornado ao usuário

        if (isEmpty()) { // não pode desempilhar! erro!
            throw new IndexOutOfBoundsException("Pilha vazia! Impossível desempilhar!");
        }

        Node<T> aux = topo;
        topo = aux.next; // primeiro aponta para o segundo
        aux.next = null;
        tamanho--;
        data = aux.data;

        return data;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public int getTamanho(){
        return tamanho;
    }

        //void push(data);

    //cria casinha e opo <- casinha
    //senão
    // cria casinha, casinha.next = topo, topo = casinha
    // criar a casinha


        //T pop();
        //não pode ser vazia!!!
        //aux = topo
        // topo aponta para aux.next, aux.next < -null
        //retorna  aux.valor

        //boolean isEmpty();
        //se o topo for null é vasio

    }

