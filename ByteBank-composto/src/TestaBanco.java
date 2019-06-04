public class TestaBanco {
    public static void main(String[] args) {
        Cliente thiago = new Cliente();
        thiago.cpf = "334.334.344-33";
        thiago.nome = "Thiago Aires";
        thiago.profissao = "Goleirao";

        System.out.println(thiago);

        Conta contaDoThiago = new Conta();
        contaDoThiago.titular = thiago;

        System.out.println(contaDoThiago.titular.nome);
    }
}
