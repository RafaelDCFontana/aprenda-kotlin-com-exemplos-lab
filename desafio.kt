// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Level { BASICO, INTERMEDIARIO, AVANCADO }

data class User (val id: Int, val name: String, var age: Int, var email: String)

data class Student (val id: Int, val name: String, var skills: Formation)

data class Content(var name: String, var duration: Int, val time: String, val level: Level)

data class Formation(val name: String, var subjects: Content) 
 
private val Subscription: MutableList<User> = mutableListOf<User>()

val Subscribed: List<User> = Subscription

fun enroll(vararg newUser: User) {
	for (User in newUser) Subscription.add(User)  
    }

private val ProgramContent: MutableList<Formation> = mutableListOf<Formation>()

val Menu: List<Formation> = ProgramContent 

fun toLearn(vararg courses: Formation) {
	for (Formation in courses) ProgramContent.add(Formation)
    }

private val Skills: MutableList<Student> = mutableListOf<Student>()

val Evolution: List<Student> = Skills

fun graduate(vararg skilled: Student){
    for (Student in skilled) Skills.add(Student)
}

fun main() {
    enroll(User(1, "Jaspion", 34, "jaspion@gmail.com"), User(2, "Jiraya", 40, "jiraya@gmail.com"))
	println("$Subscribed")
    toLearn(
        Formation("Formação HTML", Content("Fundamentos HTML", 30, "horas", Level.BASICO)),
        Formation("Formação HTML", Content("Propriedades HTML", 15, "horas", Level.INTERMEDIARIO )),
        Formation("Formação HTML", Content("Projetos HTML", 20, "horas", Level.AVANCADO)),
        Formation("Formação CSS", Content("Fundamentos CSS", 30, "horas", Level.BASICO)),
        Formation("Formação CSS", Content("Propriedades CSS", 15, "horas", Level.INTERMEDIARIO )),
        Formation("Formação CSS", Content("Projetos CSS", 20, "horas", Level.AVANCADO))
           )
    println("$Menu")
    graduate(
        Student(1, "Jaspion", Formation("Formação HTML", Content("Projetos HTML", 20, "horas", Level.AVANCADO))),
		Student(2, "Jiraya", Formation("Formação CSS", Content("Projetos HTML", 20, "horas", Level.AVANCADO)))             
            )
 	println("$Skills")   
}
