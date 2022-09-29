import io.ktor.client.*
import io.ktor.client.engine.curl.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.coroutines.runBlocking

fun main() {
     runBlocking {

         Greeting().getHtml()
     }
}

class Greeting {
    private val client = HttpClient(Curl)
    suspend fun getHtml(): String {
         val response = client.get("https://ktor.io/docs")

         return response.bodyAsText()
    }
}