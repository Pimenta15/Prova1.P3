public class Trabalhador {
  
    private String nome;
    private int idade;
    private double valorHora;
    private int horaTrab;
    private boolean ferias;
    
    public Trabalhador(String nome, int idade, double valorHora) {
        this.nome = nome;
        this.idade = idade;
        this.valorHora = valorHora;
        this.horaTrab = 0;
        this.ferias = false;
    }
    
    public void ferias(){

        this.ferias = !this.ferias;

    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public int getHoraTrab() {
        return horaTrab;
    }
    public void setHoraTrab(int horaTrab) {
        this.horaTrab = horaTrab;
    }
    public boolean getFerias() {
        return ferias;
    }
    public void setFerias(boolean ferias) {
        this.ferias = ferias;
    }

}
