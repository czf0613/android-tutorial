import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object Database {
    suspend fun getData(id: Int): String {
        return withContext(Dispatchers.IO) {
            "hello $id"
        }
    }
}