import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = {6.5, 8.5, 7.9, 6.4, 6.0};
        boolean sucesso = false;
        while (!sucesso) {
            System.out.println("Nesta sala temos " + notas.length + " alunos");
            System.out.print("Número do aluno que você quer consultar (começando do 1): ");
            try{
                int numero = Integer.parseInt(sc.nextLine());
            
                System.out.println("Nota: " + notas[numero - 1]);
                sucesso = true;
            }
            catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("O número do aluno deve ser de 1  a " + notas.length);
                System.out.println("Mensagem de erro: " + ex.getMessage());
            }
            catch(NumberFormatException ex){
                System.out.println("Entre apenas números!");
                System.out.println("Mensagem de erro: " + ex.getMessage());
            }
        }
    }
}
