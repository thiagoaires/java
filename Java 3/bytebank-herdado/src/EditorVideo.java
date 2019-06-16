public class EditorVideo extends Funcionario{

  public double getBonificacao(){
    System.out.println("Bonus Editor");
    return 50 + super.getSalario();
  }

}
