public class StackTest {
    public static void main(String[] args) {
        StackObject s = new StackObject();

         s.push(125);
        s.push(555);
        s.push(677);
        s.push(654);

        try {
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            // Erro! fila vazia
        } catch (IndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Fim do Programa!");
    }
}
