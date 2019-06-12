public class ControleBonificacao {

  private double soma;

  public void registra(Funcionario fuu){
    Double bonus = fuu.getBonificacao();
    this.soma += bonus;
  }

  public double getSoma() {
    return soma;
  }
}
