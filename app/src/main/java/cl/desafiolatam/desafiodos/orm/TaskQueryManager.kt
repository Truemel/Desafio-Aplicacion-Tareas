package cl.desafiolatam.desafiodos.orm

import androidx.room.Delete
import androidx.room.Query
import androidx.room.Update

class TaskQueryManager(val dao: TaskDAO) {

    fun insertTask(task:Task){
        dao.insertTask(task)
    }

    fun updateTask(task: Task){
        dao.updateTask(task)
    }

    fun deleteAll(){
        dao.deleteAll()
    }

    fun getAllTasks():MutableList<Task>{
        return dao.getAllTasks()
    }
}