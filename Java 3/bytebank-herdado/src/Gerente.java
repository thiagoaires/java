public class Gerente extends Funcionario{


  private int senha;


  public double getBonificacao(){
    System.out.println("Bonus Gerente");
    return super.getSalario();
  }

  public void setSenha(int senha) {
    this.senha = senha;
  }


  public boolean autentica(int senha){
    if (this.senha == senha){
      return true;
    } else{
      return false;
    }
  }
}
