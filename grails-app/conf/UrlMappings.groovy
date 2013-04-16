class UrlMappings {

	static mappings = {
		"/home/loginSuccess" (controller: "loginSuccess")
		"/login/$action" (controller: "login")
       	"/logout/$action" (controller:  "logout")

		"/home/dashboard" (view: "/dashboard")

		"/"(view:"/index")
		"500"(view:'/error')


		"/admin/dashboard" (view: "/dashboard")
		"/admin/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}
	}
}
