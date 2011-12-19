import grails.util.GrailsUtil
import games.Game
import games.User

class BootStrap {
	
	def springSecurityService

    def init = { servletContext ->
		  switch (GrailsUtil.environment) {
            case "development":
				
				Game.executeUpdate("Delete Game")
                new Game(name: "little big planet", description: "mu–ecos de trapo", rate: 9).save()
				new Game(name: "call of dutty", description: "tiros", rate: 8).save()
				new Game(name: "guitar hero", description: "guitarras de plastico", rate: 9).save()
				new Game(name: "cutre game", description: "mas malo que el dolor", rate: 3).save()
				
				User.executeUpdate("Delete User")
				new User(uuid: "DDFDFSXDFEESSD", 
					     name: "alfredo", 
						 password: springSecurityService.encodePassword("acasado")).save(failOnError: true)
				
			    break
        } 
		
    }
    def destroy = {
    }
}
