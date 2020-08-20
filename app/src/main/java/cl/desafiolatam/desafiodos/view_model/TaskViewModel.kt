package cl.desafiolatam.desafiodos.view_model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import cl.desafiolatam.desafiodos.orm.Task
import cl.desafiolatam.desafiodos.orm.TaskDAO
import cl.desafiolatam.desafiodos.orm.TaskDB
import cl.desafiolatam.desafiodos.orm.TaskQueryManager
import kotlinx.coroutines.launch

class TaskViewModel(application: Application):AndroidViewModel(application) {

    private var manager:TaskQueryManager
    val allTaskList:LiveData<MutableList<Task>>

    init {
        manager = TaskQueryManager(TaskDB.getDB(application).getTaskDAO())
        allTaskList = manager.allTasksList
    }

    fun insertTask(task: Task) = viewModelScope.launch { manager.insertTask(task) }

    fun updateTask(task: Task) = viewModelScope.launch { manager.updateTask(task) }

    fun deleteAll() = viewModelScope.launch { manager.deleteAll() }
}