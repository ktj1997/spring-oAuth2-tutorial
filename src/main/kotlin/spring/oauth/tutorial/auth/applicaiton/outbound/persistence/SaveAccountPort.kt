package spring.oauth.tutorial.auth.applicaiton.outbound.persistence

import spring.oauth.tutorial.auth.applicaiton.inbound.rest.controller.model.SignUpCommand
import spring.oauth.tutorial.auth.domain.Account

interface SaveAccountPort {

    fun save(command: SignUpCommand): Account
}
