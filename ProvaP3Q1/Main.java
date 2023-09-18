public class Main {
    public static void main(String[] args) {
        Trabalhador Arthur = new Trabalhador("Arthur", 21, 50);
        Trabalhador Pimenta = new Trabalhador("João", 19, 15);
        double total = 0;
        Empresa Vapo = new Empresa("Vapo", "1234567890", "Boa Vista", "Augusto");

       
        Vapo.contratar(Pimenta);
        Vapo.contratar(Arthur);
        Vapo.trabalhar();
        total = Vapo.calcularPagamento();
       
        System.out.println("Total a desembolsar para os funcionarios: " + 
        total );

        Arthur.ferias();

        total = Vapo.calcularPagamento();
       
        System.out.println("Total a desembolsar para os funcionarios: " + 
        total );

        Arthur.ferias();
        Pimenta.ferias();

        total = Vapo.calcularPagamento();
       
        System.out.println("Total a desembolsar para os funcionarios: " + 
        total );


    }
}
