package games

class Game {

	static mapping = {
		version false		
		table name: "games", schema: "games_data"
	}
	
	String name
	String description
	Integer rate
	
}
