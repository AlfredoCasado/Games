package games

class NewGameCommand {
	String name
	String description
	Integer rate
	
	static constraints = {
		rate	range:0..10
	}
}
