class Funcionario{
    private String nome;
    protected double salario;
    protected double bonus;
    public void setSalario(double valor){
        this.salario = valor;
    }
    
    public void setNome(String nome){
        this.nome = nome;
        
    }
    
    public double getBonus(){
        bonus =this.salario *0.2;
        return bonus;
    } 
}


class Gerente extends Funcionario{
    
    public double getBonus(){
        bonus =this.salario *0.3;
        return bonus;
    }
}

class Desenvolvedor extends Funcionario{
    
    public double getBonus(){
        bonus =this.salario *0.25;
        return bonus;
    }
}

class TotalDeBonus{
    private static double totalDeBonus = 0;
    
    public void setTotalDeBonus(double valor){
        
        totalDeBonus +=valor;
    }
    
    public double getTotalDeBonus(){
        return totalDeBonus;
    }
    
}


public class TestaFuncionario {
    public static void main(String[] args){

        Funcionario rodolpho = new Funcionario();
        
        rodolpho.setSalario(1000);
        rodolpho.setNome("Rodolpho");
        System.out.println(rodolpho.getBonus());
        
        Gerente thiago = new Gerente();
        thiago.setNome("Thiago");
        thiago.setSalario(2000);
        
        System.out.println(thiago.getBonus());
        
        TotalDeBonus total = new TotalDeBonus();
        total.setTotalDeBonus(rodolpho.bonus);
        total.setTotalDeBonus(thiago.bonus);
        
        System.out.println(total.getTotalDeBonus());
    }
}
