import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Ex3 {
    public static void main(String[] args) {
        while(true){
            Scanner input = new Scanner(System.in);
            Queue<Avioes> listaAvioes = new LinkedList<Avioes>();

            Avioes aviao = new Avioes();
            listaAvioes.add(aviao);

            System.out.println("\nMENU DE OPERAÇÕES \n1- LISTAR QUANTIDADE DE AVIOES\n2- DECOLAR AVIAO\n3- ADICIONAR AVIAO\n4- LISTAR AVIOES\n5- CARACTERISTICAS DO PRIMEIRO AVIAO\n6- PARAR PROGRAMA\n \n DIGITE A OPERAÇÃO: ");
            int op = input.nextInt();

            if(op == 1){
                System.out.println("A QUANTIDADE DE AVIOES NA FILA DE PARTIDA É: " + (listaAvioes.size() -1));
            }else{
                if(op == 2){
                    System.out.println("O AVIAO " + listaAvioes.poll().getNome() + "\n");
                }else{
                    if(op == 3){
                        Avioes novoAviao = new Avioes();

                        System.out.println("INSIRA O NOME DO AVIAO: ");
                        novoAviao.setNome(input.nextLine());

                        input.nextLine();
                        System.out.println("INSIRA A DISCRICAO DO AVIAO: ");
                        novoAviao.setDiscricao(input.nextLine());

                        listaAvioes.add(novoAviao);
                    }else{
                        if(op == 4){
                            Stack<Avioes> aux = new Stack<>();
                            int tamanho = listaAvioes.size();
                            for(int i = 0; i < tamanho; i++){
                                aux.push(listaAvioes.peek());
                                System.out.println("AVIAO: " + listaAvioes.poll().getNome());
                            }
                            for(int i = 0; i <= tamanho; i++){
                                listaAvioes.add(aux.pop());
                            }
                        }else{
                            if(op == 5){
                                System.out.println("A DESCRICAO É: " + listaAvioes.peek().getDiscricao());
                            }else{
                                if(op == 6){
                                    break;
                                }
                            }
                    }
                }
                }
            }
        }
    }
}
