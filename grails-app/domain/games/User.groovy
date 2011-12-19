package games

class User {

    static mapping = {
		version false		
		table name: "gm_users", schema: "games_users"
		id generator:'assigned', name:'uuid'		
	}
	
	String uuid
	String name
	String password
}
