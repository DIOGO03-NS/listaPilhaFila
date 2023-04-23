import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex7 {
    public static void inverter(Queue<Integer> fila){
        Stack<Integer> pilha = new Stack<>(); 
        for(int i = 0; i < 20; i++){
            pilha.push(fila.poll());
        }
        for(int i = 0; i < 20; i++){
            fila.add(pilha.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> lista = new LinkedList<Integer>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);
        lista.add(11);
        lista.add(12);
        lista.add(13);
        lista.add(14);
        lista.add(15);
        lista.add(16);
        lista.add(17);
        lista.add(18);
        lista.add(19);
        lista.add(20);

        inverter(lista);

        for(int i = 0; i < 20; i++){
            System.out.println(lista.poll());
        }
    }
}
