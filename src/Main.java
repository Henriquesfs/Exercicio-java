import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Insira o cargo do funcionário: ");
            Cargo cargo = Cargo.valueOf(sc.nextLine());
            System.out.println("Insira o salário do funcionário: ");
            double salario = sc.nextDouble();

            Funcionario funcionario = new Funcionario(cargo, salario);
            System.out.println(funcionario);
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}