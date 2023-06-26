package Jardinagem;

public class Jardinagem {
    private String nomeJardim;
    private int qtdMetros;
    private int qtdPlantas;
    private int qtdMetrosGrama;
    private int gramaAdubo;
    private double valorAdubo;
    private double valorMetroGrama;
    private double valorConteGrama;

    public Jardinagem(String nomeJardim, int qtdMetros, int qtdPlantas, int qtdMetrosGrama,
                      int gramaAdubo, double valorAdubo, double valorMetroGrama, double valorConteGrama) {
        this.nomeJardim = nomeJardim;
        this.qtdMetros = qtdMetros;
        this.qtdPlantas = qtdPlantas;
        this.qtdMetrosGrama = qtdMetrosGrama;
        this.gramaAdubo = gramaAdubo;
        this.valorAdubo = valorAdubo;
        this.valorMetroGrama = valorMetroGrama;
        this.valorConteGrama = valorConteGrama;
    }

    public double usarAdubo() {
        int aduboUsado = this.qtdMetrosGrama / 2 * this.gramaAdubo;
        return aduboUsado;
    }

    public double precoAdubo() {
        double aduboUsado = usarAdubo();
        return aduboUsado * this.valorAdubo;
    }

    public double precoCorteGrama() {
        return this.qtdMetrosGrama * this.valorMetroGrama;
    }
}
