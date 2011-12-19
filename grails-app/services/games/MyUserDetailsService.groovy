package games

import org.codehaus.groovy.grails.plugins.springsecurity.GrailsUser
import org.codehaus.groovy.grails.plugins.springsecurity.GrailsUserDetailsService
import org.codehaus.groovy.grails.plugins.springsecurity.SpringSecurityUtils
import org.springframework.security.core.authority.GrantedAuthorityImpl
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UsernameNotFoundException

class MyUserDetailsService implements GrailsUserDetailsService {

   static final List NO_ROLES = [new GrantedAuthorityImpl(SpringSecurityUtils.NO_ROLE)]

   UserDetails loadUserByUsername(String username, boolean loadRoles) throws UsernameNotFoundException {
      return loadUserByUsername(username)
   }

   UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
         User user = User.findByName(username)
         if (!user) throw new UsernameNotFoundException('User not found', username)

         return new GrailsUser(user.name, user.password, true, true, true, true, NO_ROLES, user.uuid)
           
      
   }
}
