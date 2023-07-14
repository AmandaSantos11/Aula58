package ClubeSocial

import java.util.*

class Clube {
    var listaDeMembros = ArrayList<Membro>()
    fun adicionarMembro(membro: Membro){
        listaDeMembros.add(membro)
    }
    fun removerMembro(membro: Membro){
        listaDeMembros.remove(membro)
    }
    fun pontuacaoTotal():Int {
        var total = 0
        for(membro in listaDeMembros){
            total+=membro.obterPontos()
        }
        return total
    }

    fun listarMembros(){
        for(membro in listaDeMembros){
            println("Nome do membro: ${membro.mostrarNome()}, total de pontos: ${membro.obterPontos()}")
        }
    }
}