package cs_grails

class JogosController {

    def index() {		
		def lista = Jogos.list();	
		//def lista = Jogos.executeQuery("select DISTINCT jogador FROM jogos");
		render(view: "/jogos/index", model:[jogadores: lista])
	}
	
	def upload(){
		render(view: "/jogos/upload")
	}
}
