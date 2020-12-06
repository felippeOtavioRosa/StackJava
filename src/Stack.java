public class Stack {

    private Node topo; // referência do topo da pilha
    private  int tamanho;

    //casinha
    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Stack(Node topo) {
        topo = null;
    }

    public Node getTopo() {
        return topo;
    }

    public void setTopo(Node topo) {
        this.topo = topo;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    //empilhar
    public void push(int data) {
        // criar a casinha
        Node aux = topo;
        topo = new Node(data);
        topo.next = aux;
        tamanho++;
    }

    // desenfileirar
    public int pop() {

        int data ; // valor retornado ao usuário

        if (isEmpty()) { // não pode desenfileirar! erro!
            throw new IndexOutOfBoundsException("Pilha vazia! Impossível desenpilhar!");
        }

        data = topo.data;  // etiqueta auxiliar aponta para o primeiro nó
        topo = topo.next; // primeiro aponta para o segundo
        tamanho--;

        return data;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public int getTamanho(){
        return tamanho;
    }

        //void push(data);
        // se a pilha estiver vazia
        //cria casinha e opo <- casinha
        //senão
        // cria casinha, casinha.next = topo, topo = casinha

        //T pop();
        //não pode ser vazia!!!
        //aux = topo
        // topo aponta para aux.next, aux.next < -null
        //retorna  aux.valor

        //boolean isEmpty();
        //se o topo for null é vasio

    }

