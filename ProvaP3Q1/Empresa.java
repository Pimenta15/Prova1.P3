
/**
 * Empresa
 */
public class Empresa {

    private String nome;
    private String cnpj;
    private Trabalhador[] trabalhadores;
    private int numFuncionario;
    private String endereco;
    private String ceo;
   
    public Empresa(String nome, String cnpj, String endereco, String ceo) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.trabalhadores = new Trabalhador[20];
        this.numFuncionario = 0;
        this.endereco = endereco;
        this.ceo = ceo;
    }

    public void contratar(Trabalhador contratado){
        
        if (this.numFuncionario != this.trabalhadores.length) {
           
            this.trabalhadores[this.numFuncionario] = contratado;
            this.numFuncionario++;

        }else{
            System.out.println("não foi possivel completar essa operação");
        }
    }

    public void trabalhar(){
      
        for (int i = 0; i < this.trabalhadores.length -1 ; i++) {
           
            if (this.trabalhadores[i]!= null && !this.trabalhadores[i].getFerias()) {
               
                int somar= trabalhadores[i].getHoraTrab() + 8;
               
                trabalhadores[i].setHoraTrab(somar);

            }
        }
    }

    public double calcularPagamento(){
        double total = 0;

        for (int i = 0; i < this.trabalhadores.length -1; i++) {
            if(this.trabalhadores[i]!= null && !trabalhadores[i].getFerias() ){
            
            total = total + trabalhadores[i].getValorHora()*trabalhadores[i].getHoraTrab();
            }
        }

        return total;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Trabalhador[] getTrabalhadores() {
        return trabalhadores;
    }

    public int getNumFuncionario() {
        return numFuncionario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }
}