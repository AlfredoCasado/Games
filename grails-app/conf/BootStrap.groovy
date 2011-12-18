import grails.util.GrailsUtil
import games.Game

class BootStrap {

    def init = { servletContext ->
		  switch (GrailsUtil.environment) {
            case "development":
				Game.executeUpdate("Delete Game")
                new Game(name: "little big planet", description: "mu–ecos de trapo", rate: 9).save()
				new Game(name: "call of dutty", description: "tiros", rate: 8).save()
				new Game(name: "guitar hero", description: "guitarras de plastico", rate: 9).save()
				new Game(name: "cutre game", description: "mas malo que el dolor", rate: 3).save()
	            break
        } 
		
    }
    def destroy = {
    }
}
