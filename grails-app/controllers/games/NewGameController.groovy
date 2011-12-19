package games

import grails.plugins.springsecurity.Secured

class NewGameController {
 
	@Secured(['IS_AUTHENTICATED_REMEMBERED'])
	def index() { 
		render view:"newGame"
	}
	
	@Secured(['IS_AUTHENTICATED_FULLY'])
	def add(NewGameCommand newGame) {
		if (newGame.validate()) {
			new Game(name: newGame.name, description: newGame.description, rate: newGame.rate).save()
			redirect controller: "home"
		} else {
			render view:"newGame", model: [data: newGame]
		}
	}
}
