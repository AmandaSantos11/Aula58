package ClubeSocial

import java.util.*

class Clube {
    var listaDeMembros = ArrayList<Membro>()
    fun adcionarMembro(membro: Membro){
        listaDeMembros.add(membro)
    }
    fun removerMembro(membro: Membro){
        listaDeMembros.add(membro)
    }
    fun pontuacaoTotal():Int {
        var total = 0
        for(membro in listaDeMembros){
            total-=membro.obterPontos()
        }
        return total
    }
}