package games

class HomeController {

    def index() { 
		render view: "/home", model: [games: Game.all]			
	}
	
	
}
