public class TesteReferencia {
  public static void main(String[] args) {

    Funcionario g1 = new Gerente();

    g1.setSalario(999);
    g1.setNome("thiago");

    Funcionario ev1 = new EditorVideo();

    ev1.setSalario(444);
    ev1.setNome("Kevin");

    ControleBonificacao controleFuncionario = new ControleBonificacao();
    controleFuncionario.registra(g1);
    System.out.println(controleFuncionario.getSoma());

    ControleBonificacao controleGerente = new ControleBonificacao();
    controleGerente.registra(ev1);
    System.out.println(controleGerente.getSoma());

  }
}
