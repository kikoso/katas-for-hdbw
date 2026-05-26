package org.example


class PersonalInfo(val email: String?)

class Client(val personalInfo: PersonalInfo?)

interface Mailer {
    fun sendEmail(email: String, message: String)
}


fun sendMessageToClient(
    client: Client?,
    message: String?,
    mailer: Mailer
) {
    val email = client?.personalInfo?.email
    if (email != null && message != null) {
        mailer.sendEmail(email, message)
    }
}


fun main() {

}