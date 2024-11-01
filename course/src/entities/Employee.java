package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    // Calcula o salário líquido
    public double netSalary() {
        return grossSalary - tax;
    }

    // Aumenta o salário de acordo com a porcentagem
    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * (percentage / 100);
    }

    // Exibe os dados do funcionario
    public String toString(){
        return String.format("Employee: %s, $ %.2f", name, netSalary());

    }
}
