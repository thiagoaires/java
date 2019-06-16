public class TesteContas {
    public static void main(String[] args) {
        Conta cp1 = new ContaCorrente(8499, 151838);
        Conta cc1 = new ContaPoupanca(0105, 212510);
        cp1.deposita(200);
        cc1.deposita(100);

        System.out.println(cc1.getSaldo());
        System.out.println(cp1.getSaldo());

        cp1.transfere(50, cc1);

        System.out.println("cc: " + cc1.getSaldo());
        System.out.println("CP: " + cp1.getSaldo());
    }
}
