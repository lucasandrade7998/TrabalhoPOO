package model;

public class GanhoCadastrar {
    private String nome;
    private double valor;


    public GanhoCadastrar(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double Valorget() {
        return valor;
    }

    public void Valorset(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("\n\n\nGanho cadastrado: ");
        builder.append("\nNome: " + getNome());
        builder.append("\nValor: " + Valorget()+ "\n\n\n");
        return builder.toString();
    }
}
