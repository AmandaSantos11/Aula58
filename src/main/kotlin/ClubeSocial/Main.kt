package ClubeSocial

fun main(){
    val  clube = Clube()

    val aluno1 = Aluno("Pedro", 10)
    clube.adicionarMembro(aluno1)
    val aluno2 = Aluno("Maria", 0)
    clube.adicionarMembro(aluno2)
    val aluno3 = Aluno("Lucas", 29)
    clube.adicionarMembro(aluno3)
    val professor = Professor("João", 20)
    clube.adicionarMembro(professor)

    println(clube.pontuacaoTotal())
    aluno2.adicionarPontos(2)
    println(aluno2.obterPontos())
    aluno2.removerPontos(2)
    println(aluno2.obterPontos())

    clube.listarMembros()
    clube.removerMembro(aluno1)
    println("\nRemovendo membro")
    clube.listarMembros()
}