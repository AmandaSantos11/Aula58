package ClubeSocial

abstract class Pessoa(var nome: String, var pontos: Int) : Membro {
    override fun adicionarPontos(pontos: Int) {
        this.pontos += pontos
    }

    override fun mostrarNome(): String {
        return nome
    }

    override fun removerPontos(pontos: Int) {
        this.pontos -= pontos
    }

    override fun obterPontos(): Int {
        return this.pontos
    }
}

class Aluno(nome: String, pontos: Int) : Pessoa(nome, pontos) {}


class Professor(nome: String, pontos: Int) : Pessoa(nome, pontos) {


}