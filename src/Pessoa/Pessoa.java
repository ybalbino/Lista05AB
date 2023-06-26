package Pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {  //peso opcional
        this.nome = nome;
        this.idade = idade;
        this.peso = 0.0;
        this.altura = altura;
    }

    public Pessoa(String nome, int idade, double peso, double altura) { //peso obrigatorio
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer() {
        this.idade++;
        if (this.idade < 21) {
            crescer(0.5);
        }
    }

    public void engordar(double pesoGanho) {
        this.peso += pesoGanho;
        System.out.println(this.nome);
        System.out.println("Engordei: " + pesoGanho);
        System.out.println("Meu peso atual é: " + this.peso);
    }

    public void emagrecer(double pesoPerdido) {
        this.peso -= pesoPerdido;
        System.out.println(this.nome);
        System.out.println("Emagreci: " + pesoPerdido);
        System.out.println("Meu peso atual é: " + this.peso);
    }

    public void crescer(double alturaGanha) {
        this.altura += alturaGanha;
    }
    public void mostrarInfo(){
        System.out.printf("%s idade: %d peso: %.2f altura: %.2f \n",
                this.nome, this.idade, this.peso, this.altura);
    }
}
