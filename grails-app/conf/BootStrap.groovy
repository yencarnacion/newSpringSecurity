import com.myApp.auth.Role
import com.myApp.auth.User
import com.myApp.auth.UserRole

class BootStrap {

    def init = { servletContext ->
	      switch (grails.util.GrailsUtil.environment){
	        case "development":

	        def userRole = Role.findByAuthority("ROLE_USER") ?: new Role(authority: "ROLE_USER").save(flush: true)
	        def adminRole = Role.findByAuthority("ROLE_ADMIN") ?: new Role(authority: "ROLE_ADMIN").save(flush: true)

	        def admin = User.get(1);
	        if(!admin){
	            admin = new User(
	                id: 1,
	                username: "root",
	                password: "welcome",
	                enabled: true,
	                ).save(flush: true, failOnError: true)
	            UserRole.create admin, adminRole
	        }

	        def user = User.get(2);
	        if(!user){
	            user = new User(
	                id: 2,
	                username: "user",
	                password: "welcome",
	                enabled: true,
	                ).save(flush: true, failOnError: true)
	            UserRole.create user, userRole
	        }

	        break;

	        case "test":

	        def userRole = Role.findByAuthority("ROLE_USER") ?: new Role(authority: "ROLE_USER").save(flush: true)
	        def adminRole = Role.findByAuthority("ROLE_ADMIN") ?: new Role(authority: "ROLE_ADMIN").save(flush: true)

	        def admin = User.get(1);
	        if(!admin){
	            admin = new User(
	                id: 1,
	                username: "root",
	                password: "welcome",
	                enabled: true,
	                ).save(flush: true, failOnError: true)
	            UserRole.create admin, adminRole
	        }

	       	def user = User.get(2);
	        if(!user){
	            user = new User(
	                id: 2,
	                username: "user",
	                password: "welcome",
	                enabled: true,
	                ).save(flush: true, failOnError: true)
	            UserRole.create user, userRole
	        }


	        break;

	        case "production":

	        def userRole = Role.findByAuthority("ROLE_USER") ?: new Role(authority: "ROLE_USER").save(flush: true)
	        def adminRole = Role.findByAuthority("ROLE_ADMIN") ?: new Role(authority: "ROLE_ADMIN").save(flush: true)

	        def admin = User.get(1);
	        if(!admin){
	            admin = new User(
	                id: 1,
	                username: "root",
	                password: "welcome",
	                enabled: true,
	                ).save(flush: true)
	            UserRole.create admin, adminRole
	        }

	        break;
	    }
	}
    def destroy = {
    }
}
