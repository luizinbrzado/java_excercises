package Aula05Desafio;

public class Principal {
    public static void main(String[] args) {
        UsuarioJogo jogador1 = new UsuarioJogo("João", "daQuebrada");
        UsuarioJogo jogador2 = new UsuarioJogo("Luiz", "luizinbrzado");

        System.out.println("Nível do "+jogador1.getNickname()+" é "+jogador1.getNivel());

        System.out.println("Colocando 300 pontos para "+jogador1.getNickname());
        jogador1.setPontuacao(300);
        System.out.println(jogador1.getPontuacao());
        System.out.println(jogador1.subirNivel());
        System.out.println("\n");

        System.out.println("Colocando 300 pontos para "+jogador2.getNickname());
        jogador2.setPontuacao(500);
        System.out.println(jogador2.getPontuacao());
        System.out.println(jogador2.bonus(100));
        System.out.println(jogador2.bonus(400));
        jogador2.setNivel(3);
        System.out.println("\n");

        infoPLayer(jogador1);
        infoPLayer(jogador2);
    }

    public static void infoPLayer(UsuarioJogo usuario) {
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Nickname: "+ usuario.getNickname());
        System.out.println("Nivel: " + usuario.getNivel());
        System.out.println("Pontos: " + usuario.getPontuacao());
        System.out.println("\n");
    }

}
