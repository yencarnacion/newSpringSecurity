package com.myApp

import org.codehaus.groovy.grails.plugins.springsecurity.SpringSecurityUtils

class LoginSuccessController {

    def index() {
        if(SpringSecurityUtils.ifAnyGranted('ROLE_USER')){
            //redirect(controller:'tu webflow controller', action:'tu accion')
            redirect(uri: "/home/dashboard")
        } else if (SpringSecurityUtils.ifAnyGranted('ROLE_ADMIN')) {
            redirect(uri: "/admin/dashboard")
        } else {
            redirect(uri: "/logout")
        }
    }
}
