package brianpelinku.u5w1d1.entities;

public class Bevande {
    private String nome;
    private double calorie;
    private double prezzo;

    public Bevande(String nome, double calorie, double prezzo) {
        this.nome = nome;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCalorie() {
        return calorie;
    }

    public void setCalorie(double calorie) {
        this.calorie = calorie;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Bevande{" +
                "nome='" + nome + '\'' +
                ", calorie= kcal " + calorie +
                ", prezzo= € " + prezzo +
                '}';
    }
}
