package school.sptech;

class Time {

    String nome;
    Integer vitorias = 0;
    Integer empates = 0;
    Integer derrotas = 0;

    void registrarVitoria() {
        vitorias++;
    }

    void registrarEmpate() {
        empates++;
    }

    void registrarDerrota() {
        derrotas++;
    }

    Integer getPontos() {
        return vitorias * 3 + empates;
    }

    Integer getTotalPartidas() {
        return vitorias + empates + derrotas;
    }

    Integer getAproveitamento() {
        return (vitorias * 100) / getTotalPartidas();
    }

    void compararAproveitamento(Time x) {
        if (getAproveitamento() > x.getAproveitamento()) {
            System.out.println("O time " + nome + "tem um aproveitamento maior que o time " + x.nome);
        } else if (getAproveitamento() < x.getAproveitamento()) {
            System.out.println("O time " + x.nome + "tem um aproveitamento maior que o time " + nome);
        } else {
            System.out.println("Os times " + nome + " e " + x.nome + " tem o mesmo aproveitamento");
        }
    }

    void exibirInformacoes() {
        System.out.println("Time: " + nome + "\n Vitórias: " + vitorias + "\n Empates: " + empates + "\n Derrotas: " + derrotas + "\n  Pontos: " + getPontos() + "\n Total de Partidas: "+ getTotalPartidas() + "\n Aproveitamento: " + getAproveitamento());
    }
}
