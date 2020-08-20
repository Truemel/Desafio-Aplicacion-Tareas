package cl.desafiolatam.desafiodos.orm

import androidx.room.*

@Dao
interface TaskDAO {
    @Insert
    fun insertTask(task:Task)

    @Update
    fun updateTask(task: Task)

    @Delete
    fun deleteAll()

    @Query("SELECT * FROM tareas")
    fun getAllTasks():MutableList<Task>
}