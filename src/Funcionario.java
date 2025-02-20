public class Funcionario {
    private Cargo cargo;
    private double salario;

    public Funcionario(Cargo cargo, double salario) {
        this.cargo = cargo;
        this.salario = salario;
    }

    public double calcularSalario(){
        if(cargo == Cargo.DEV){
            return salario * (salario > 3000 ? 1.10 : 1.20);
        } else{
            return salario * (salario > 3000 ? 1.5 : 1.20);
        }
    }

    @Override
    public String toString(){
        return "Salário atualizado: "+calcularSalario();
    }
}
