public class TesteReferencia {
  public static void main(String[] args) {

    Funcionario g1 = new Funcionario();

    g1.setSalario(999);
    g1.setNome("thiago");

    Funcionario g2 = new Gerente();

    g2.setSalario(444);
    g2.setNome("Kevin");

    ControleBonificacao controleFuncionario = new ControleBonificacao();
    controleFuncionario.registra(g1);
    System.out.println(controleFuncionario.getSoma());

    ControleBonificacao controleGerente = new ControleBonificacao();
    controleGerente.registra(g2);
    System.out.println(controleGerente.getSoma());

  }
}
