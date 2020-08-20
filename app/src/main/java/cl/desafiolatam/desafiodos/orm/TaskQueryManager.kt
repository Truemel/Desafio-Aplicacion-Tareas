package cl.desafiolatam.desafiodos.orm

import androidx.lifecycle.LiveData

class TaskQueryManager(val dao: TaskDAO) {

    val allTasksList:LiveData<MutableList<Task>> = dao.getAllTasks()

    suspend fun insertTask(task:Task){
        dao.insertTask(task)
    }

    suspend fun updateTask(task: Task){
        dao.updateTask(task)
    }

    suspend fun deleteAll(){
        dao.deleteAll()
    }
}