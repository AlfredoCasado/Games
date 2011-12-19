package games

class RateTagLib {
	
	def rate = { attrs ->
		if (attrs.rate > 5) out << '<span style="color: green">' + attrs.rate +'</span>'
		else out << '<span style="color: red">' + attrs.rate + '</span>'		
	}

}
