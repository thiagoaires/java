public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.deposita(200);

        Conta segundaConta = new Conta();
        segundaConta.deposita(230);

//        boolean conseguiuRetirar = segundaConta.saca(210);
//
//        System.out.println(conseguiuRetirar);

        System.out.println(primeiraConta.saldo);
        System.out.println(segundaConta.saldo);
        if(primeiraConta.transfere(50, segundaConta)){
            System.out.println("transferencia feita com sucesso");
        } else{
            System.out.println("sem saldo");
        }

        System.out.println(primeiraConta.saldo);
        System.out.println(segundaConta.saldo);
    }

}
