package games

class PasswordEncoder implements org.springframework.security.authentication.encoding.PasswordEncoder {

    @Override
    String encodePassword(String password, salt = null) {
        return password
    }

    @Override
    public boolean isPasswordValid(String encodedPassword, String rawPassword, salt = null) {
		print encodedPassword
		print rawPassword
		return (encodedPassword == rawPassword)
    }

}
