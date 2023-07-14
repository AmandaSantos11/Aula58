package ClubeSocial

interface Membro {
    fun adicionarPontos(pontos: Int){}
    fun removerPontos(pontos: Int)
    fun obterPontos(): Int
    fun mostrarNome(): String
}