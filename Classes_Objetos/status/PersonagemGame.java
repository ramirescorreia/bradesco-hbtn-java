public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public void tomarDano(int quantidadeDeDano) {
        if(saudeAtual - quantidadeDeDano <= 0) {
            setSaudeAtual(0);
            return;
        }
        setSaudeAtual(saudeAtual - quantidadeDeDano);
    }

    public void receberCura(int quantidadeDeCura) {
        if(saudeAtual + quantidadeDeCura > 100) {
            setSaudeAtual(100);
            return;
        }
        setSaudeAtual(saudeAtual + quantidadeDeCura);
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if(saudeAtual > 0) {
            this.status = "vivo";
        } else if(saudeAtual == 0) {
            this.status = "morto";
        } 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus(){
        return status;
    }
}