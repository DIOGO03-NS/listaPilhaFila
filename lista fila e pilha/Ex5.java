import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Random;

public class Ex5 {
    public static void main(String[] args) {
        Queue<Integer> F = new LinkedList<>();
        Stack<Integer> P = new Stack<>();
        Random gerador = new Random();

        for(int i = 0; i < 1000; i++){
            int numero = gerador.nextInt();
            if(F.contains(numero)){
                P.push(numero);
            }else{
                 F.add(numero);
            }
        }
        for(int i = 0; i <= F.size(); i++){
            System.out.println(F.poll());
        }
        System.out.println("---------------------------------------");

        for(int i = 0; i <= P.size(); i++){
            System.out.println(P.pop());
        }
    }
}
