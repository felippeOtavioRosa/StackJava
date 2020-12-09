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

    public Stack() {
        topo = null;
    }

    //empilhar
    public void push(int data) {
        // se a pilha estiver vazia
        if (isEmpty()){
            Node aux = new Node(data);
            topo = aux;
        }
        else {
            Node aux = new Node(data);
            aux.next = topo;
            topo = aux;
        }
        tamanho++;
    }

    // desenfileirar
    public int pop() {

        //T pop();
        //não pode ser vazia!!!
        //aux = topo
        // topo aponta para aux.next, aux.next < -null
        //retorna  aux.valor

        int data ; // valor retornado ao usuário

        if (isEmpty()) { // não pode desempilhar! erro!
            throw new IndexOutOfBoundsException("Pilha vazia! Impossível desempilhar!");
        }

        Node aux = topo;
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

