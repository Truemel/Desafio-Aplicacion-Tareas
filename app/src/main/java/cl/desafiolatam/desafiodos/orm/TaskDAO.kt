package cl.desafiolatam.desafiodos.orm

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TaskDAO {
    @Insert
    suspend fun insertTask(task:Task)

    @Update
    suspend fun updateTask(task: Task)

    @Query("DELETE FROM tareas")
    suspend fun deleteAll()

    @Query("SELECT * FROM tareas")
    fun getAllTasks():LiveData<MutableList<Task>>
}