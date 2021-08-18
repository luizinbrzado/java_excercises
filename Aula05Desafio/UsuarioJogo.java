package Aula05Desafio;

public class UsuarioJogo {
    private String nome;
    private String nickname;
    private int pontuacao;
    private int nivel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel += nivel;
    }

    public UsuarioJogo(String nome, String nickname) {
        this.nome = nome;
        this.nickname = nickname;
        this.pontuacao = 0;
        this.nivel = 1;
    }

    public String aumentarPontuacao() {
        this.pontuacao += 100;
        return "Sua pontuação agora é "+ this.pontuacao;
    }

    public String subirNivel() {
        this.nivel += 1;
        return "Agora você está no nível "+this.nivel;
    }

    public String bonus(int valor) {
        this.pontuacao += valor;
        return "Você ganhou " + valor +" pontos de bônus e agora está com "+this.pontuacao+" pontos";
    }
}
