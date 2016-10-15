package cs_grails

class JogosController {

    def index() {
		def matadores = Jogos.executeQuery("select DISTINCT jogador FROM Jogos");
		for(matador in matadores) {
			def vitimados = Jogos.executeQuery("Select vitima from Jogos where jogador='$matador'")
			for(vitima in vitimados) {
				def nFacas = Jogos.executeQuery("Select COUNT (vitima) from Jogos where jogador='$matador' and vitima='$vitima'")
				vitimados = Jogos.executeQuery("select DISTINCT vitima FROM Jogos where jogador='$matador' and vitima='$vitima'")
				println "$matador deu $nFacas em $vitimados"
			}
			vitimados = vitimados + vitimados;					
		}
		println "$matador  $vitimados  "
		
		//def lista = Jogos.executeQuery("Select count(vitima) from Jogos where jogador=${matador}")
		//println lista		
		def lista = Jogos.list();	
		//def lista = Jogos.executeQuery("select DISTINCT jogador FROM jogos");
		render(view: "/jogos/index", model:[jogadores:lista])
	}
	
	def upload(){
		render(view: "/jogos/upload")
	}
	

}
