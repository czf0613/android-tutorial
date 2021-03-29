import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch(Dispatchers.Unconfined) {
        val result1 = async {
            Database.getData(10086)
        }
        val result2 = async { Database.getData(10087) }
        val result3 = async { Database.getData(10088) }

        println("${result1.await()} \n${result2.await()} \n${result3.await()}")
    }

    readLine()
}