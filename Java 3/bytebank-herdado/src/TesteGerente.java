public class TesteGerente {

  public static void main(String[] args) {

    Gerente thiago = new Gerente();

    thiago.setNome("Thiago.As");
    thiago.setCpf("465465464-87");
    thiago.setSalario(5000);
    thiago.setSenha(3232);

    thiago.getSalario();

    boolean autenticou = thiago.autentica(3232);


    System.out.println(thiago.getNome() + " " + thiago.getCpf() + " " + thiago.getSalario());
    System.out.println(thiago.getBonificacao());
    System.out.println(autenticou);

  }
}
