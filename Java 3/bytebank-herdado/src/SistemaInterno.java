public class SistemaInterno {

  private int senha = 2222;

  public void autentica(Gerente g){
    boolean autenticou = g.autentica(this.senha);

    if(autenticou){
      System.out.println("logado");
    }else {
      System.out.println("Senha invalida");
    }
  }

}
