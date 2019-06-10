public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario nico = new Funcionario();

        nico.setNome("nico Steppat");
        nico.setSalario(2976.00);

        System.out.println(nico.getNome() + " - " + nico.getBonificacao());
    }

}
